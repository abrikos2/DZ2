import java.util.*;

class ProductManager {
    private static final Map<Integer, Product> allProducts = new HashMap<>();
    private static int productIdCounter = 1;


    public static Product createProduct(String title, double price, String description) {
        int id = productIdCounter++;
        Product product = new Product(id, title, price, description);
        allProducts.put(id, product);
        return product;
    }


    public static boolean deleteProduct(int productId) {
        if (allProducts.containsKey(productId)) {
            allProducts.remove(productId);
            return true;
        }
        return false;
    }


    public static Product getProductById(int productId) {
        return allProducts.get(productId);
    }


    public static List<Product> getAllProducts() {
        return new ArrayList<>(allProducts.values());
    }


    public static List<Product> findProductsByTitle(String searchTerm) {
        List<Product> result = new ArrayList<>();
        for (Product product : allProducts.values()) {
            if (product.getTitle().toLowerCase().contains(searchTerm.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }


    public static void showAllProducts() {
        System.out.println("=== ВСЕ ПРОДУКТЫ ===");
        if (allProducts.isEmpty()) {
            System.out.println("Продукты не найдены.");
            return;
        }
        for (Product product : allProducts.values()) {
            System.out.println(product);
        }
    }
}