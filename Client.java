import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private double wallet;
    private static List<Category> cart = new ArrayList<>();

    private List<Category> purchases = new ArrayList<>();

    public Client(String name, double wallet, List<Category> cart){
        this.name = name;
        this.wallet = wallet;
        this.cart = cart;
    }



    public void showInfo(){
        System.out.println("Клиент - " + getName() + "\n"
                + " Кошелек - " + getwallet() + "\n"
                + "Покупки: " + purchases.size());
    }

    public boolean hasEnoughMoney(double value) {return value <= wallet;}

    public String getName(){return this.name;}
    public double getwallet(){return this.wallet;}
    public static List<Category> getCart() {return cart;}

    public String setName(String name){return this.name = name;}
    public static void addCart(Category category) {cart.add(category);}
    public static void delCart(Category category) {cart.remove(category);}
    public double pluswallet(double wallet){return this.wallet = this.wallet + wallet;}
    public double minuswallet(double wallet){return this.wallet = this.wallet - wallet;}

}

