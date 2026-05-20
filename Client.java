import java.util.*;
class Client {
    private String name;
    private double wallet;
    private List<Product> cart;
    private List<Product> purchases;
    private Payment paymentStrategy; // Изменён тип
    private double bonusBalance;

    public Client(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.cart = new ArrayList<>();
        this.purchases = new ArrayList<>();
        this.bonusBalance = 0;
        // По умолчанию — оплата из кошелька
        this.paymentStrategy = new CartPayment(this);
    }

    public void showInfo() {
        System.out.println("Клиент: " + name);
        System.out.println("Кошелёк: " + wallet + " руб.");
        System.out.println("В корзине: " + cart.size() + " товаров");
        System.out.println("Куплено: " + purchases.size() + " товаров");
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getWallet() { return wallet; }
    public void plusWallet(double amount) { this.wallet += amount; }
    public void minusWallet(double amount) { this.wallet -= amount; }

    public List<Product> getCart() { return cart; }
    public void addToCart(Product product) { cart.add(product); }
    public void removeFromCart(Product product) { cart.remove(product); }

    public List<Product> getPurchases() { return purchases; }
    public void addToPurchases(Product product) { purchases.add(product); }

    // Работа с бонусами
    public double getBonusBalance() { return bonusBalance; }
    public void addBonus(double amount) { bonusBalance += amount; }
    public void useBonus(double amount) {
        if (amount <= bonusBalance) {
            bonusBalance -= amount;
            System.out.println("Использовано бонусов: " + amount + " руб. Остаток бонусов: " + bonusBalance);
        } else {
            System.out.println("Недостаточно бонусов! Доступно: " + bonusBalance + ", требуется: " + amount);
        }
    }

    // Смена стратегии оплаты
    public void setPaymentStrategy(Payment x) {
        this.paymentStrategy = x;

    }

    public Payment getPaymentStrategy() {
        return this.paymentStrategy;
    }

    /**
     * Оформление покупки — оплата и перемещение товаров из корзины в покупки
     */
    public boolean checkout() {
        double total = cart.stream().mapToDouble(Product::getPrice).sum();

        // Применяем бонусы (до 50% от суммы)
        double maxBonusUse = total * 0.5;
        double bonusToUse = Math.min(maxBonusUse, bonusBalance);

        if (bonusToUse > 0) {
            useBonus(bonusToUse);
            total -= bonusToUse;
            System.out.println("Применены бонусы: " + bonusToUse + " руб. К оплате: " + total);
        }

        // Используем текущую стратегию оплаты
        if (paymentStrategy.pay(total)) {
            purchases.addAll(cart);
            cart.clear();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Клиент: %s | Кошелёк: %.2f руб. | Бонусы: %.2f руб.",
                name, wallet, bonusBalance);
    }
}