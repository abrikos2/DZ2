import java.util.*;

// Класс продукта с ID
class Product {
    private int id;
    private String title;
    private double price;
    private String description;

    public Product(int id, String title, double price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }

    public void setTitle(String title) { this.title = title; }
    public void setPrice(double price) { this.price = price; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return String.format("ID: %d | %s - %.2f руб. | %s",
                id, title, price, description);
    }
}