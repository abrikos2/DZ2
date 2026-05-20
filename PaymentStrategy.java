import java.util.*;
interface Payment {
    boolean pay(double amount);
}

class CartPayment implements Payment {
    private Client client;

    public CartPayment(Client client) {
        this.client = client;
    }

    @Override
    public boolean pay(double amount) {
        if (client.getWallet() >= amount) {
            client.minusWallet(amount);
            System.out.println("Оплата из кошелька прошла успешно. Сумма: " + amount + " руб.");
            return true;
        } else {
            System.out.println("Недостаточно средств в кошельке!");
            return false;
        }
    }
}

class CardPayment implements Payment {
    private Client client;

    public CardPayment(Client client) {
        this.client = client;
    }

    @Override
    public boolean pay(double amount) {
        double bonus = amount * 0.01; // 1% бонусов
        client.addBonus(bonus);
        System.out.println("Оплачено картой: " + amount + " руб. Начислено бонусов: " + bonus + " руб.");
        return true;
    }
}

class CreditPayment implements Payment {
    private double creditLimit;
    private double usedCredit;

    public CreditPayment(double creditLimit) {
        this.creditLimit = creditLimit;
        this.usedCredit = 0;
    }

    @Override
    public boolean pay(double amount) {
        if (usedCredit + amount <= creditLimit) {
            usedCredit += amount;
            System.out.println("Оплачено в кредит: " + amount + " руб. Использовано кредита: " + usedCredit + " из " + creditLimit);
            return true;
        } else {
            System.out.println("Недостаточно кредитного лимита! Требуется: " + amount + ", доступно: " + (creditLimit - usedCredit));
            return false;
        }
    }

    // Погашение кредита
    public  void repayCredit(double amount) {
        usedCredit = Math.max(0, usedCredit - amount);
        System.out.println("Погашено кредита: " + amount + " руб. Осталось долга: " + usedCredit);
    }
}





// Оплата картой с начислением бонусов (1% от суммы)


// Оплата в кредит


