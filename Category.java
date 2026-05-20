import java.util.*;

class Category {
    private static int idgen = 1;
    private int id;
    private String title;
    private String description;
    private String categoryType;
    private List<Integer> productIds; // Храним ID продуктов вместо объектов

    public Category(String categoryType, String title, String description) {
        this.id = idgen++;
        this.title = title;
        this.description = description;
        this.categoryType = categoryType;
        this.productIds = new ArrayList<>();
    }


    public boolean addProductById(int productId) {
        Product product = ProductManager.getProductById(productId);
        if (product != null) {
            productIds.add(productId);
            return true;
        }
        return false;
    }


    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        for (int productId : productIds) {
            Product product = ProductManager.getProductById(productId);
            if (product != null) {
                products.add(product);
            }
        }
        return products;
    }



    public void showInfo() {
        System.out.println(categoryType + " - " + title);
        System.out.println("ID: " + id);
        System.out.println("Описание: " + description);
        System.out.println("Товары в категории:");
        for (Product p : getProducts()) {
            System.out.println("  - " + p);
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
