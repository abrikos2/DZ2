import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ СИСТЕМЫ ОПЛАТЫ И БОНУСОВ ===\n");

        // Создаём продукты
        Product phone1 = ProductManager.createProduct("iPhone 15", 99990.0, "Флагманский смартфон Apple");
        Product laptop = ProductManager.createProduct("MacBook Pro", 180000.0, "Профессиональный ноутбук Apple");

        // Создаём клиентов
        Client client1 = new Client("Иван Иванов", 300000.0); // С кошельком
        Client client2 = new Client("Мария Петрова", 0.0);     // Без денег, но с кредитом

        ClientList.addClient(client1);
        ClientList.addClient(client2);

        System.out.println("1. Клиент с кошельком:");
        System.out.println(client1);

        // Добавляем товары в корзину
        client1.addToCart(phone1);
        client1.addToCart(laptop);

        System.out.println("\n2. Корзина клиента:");
        for (Product p : client1.getCart()) {
            System.out.println("  - " + p);
        }

        // Оплата картой (с начислением бонусов)
        System.out.println("\n3. Оплата картой:");
        client1.setPaymentStrategy(new CardPayment(client1));
        client1.checkout();
        System.out.println("После оплаты: " + client1);

        // Добавляем ещё товар
        client1.addToCart(phone1);

        // Используем бонусы
        System.out.println("\n4. Использование бонусов:");
        client1.useBonus(5000);
        System.out.println("После использования бонусов: " + client1);

        // Оплата в кредит
        System.out.println("\n5. Оплата в кредит:");
        client2.addToCart(phone1);
        client2.setPaymentStrategy(new CreditPayment(100000));
        client2.checkout();
        System.out.println("Клиент с кредитом: " + client2);

        // Погашение кредита
        System.out.println("\n6. Погашение кредита:");
        Payment currentStrategy = client2.getPaymentStrategy();
        CreditPayment creditPayment = (CreditPayment) currentStrategy;
        creditPayment.repayCredit(50000);


        // Демонстрация всех способов оплаты для одного клиента
        System.out.println("\n8. Демонстрация разных способов оплаты для одного клиента:");
        Client versatileClient = new Client("Ольга Новикова", 200000.0);

        versatileClient.addToCart(laptop);

        System.out.println("Исходный баланс: " + versatileClient);

        // Оплата картой (с начислением бонусов)
        System.out.println("\n— Оплата картой (начисление бонусов):");
        versatileClient.setPaymentStrategy(new CardPayment(versatileClient));
        versatileClient.checkout();
        System.out.println("Баланс после оплаты картой: " + versatileClient);

        // Добавляем товар снова для следующего теста
        versatileClient.addToCart(phone1);

        // Оплата в кредит
        System.out.println("\n— Оплата в кредит:");
        CreditPayment creditStrategy = new CreditPayment(150000);
        versatileClient.setPaymentStrategy(creditStrategy);
        versatileClient.checkout();
        System.out.println("Баланс после оплаты в кредит: " + versatileClient);

        // Погашение части кредита
        System.out.println("\n— Погашение кредита:");
        creditStrategy.repayCredit(50000);

        // Используем бонусы для следующей покупки
        System.out.println("\n— Использование бонусов:");
        versatileClient.useBonus(2000);
        System.out.println("Баланс после использования бонусов: " + versatileClient);

        // Финальная проверка всех продуктов
        System.out.println("\n9. Финальная проверка:");
        System.out.println("Итоговый список всех продуктов:");
        ProductManager.showAllProducts();

        System.out.println("\n=== ТЕСТИРОВАНИЕ СИСТЕМЫ ОПЛАТЫ И БОНУСОВ ЗАВЕРШЕНО ===");
    }
}
