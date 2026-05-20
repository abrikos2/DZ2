import java.util.*;

public class CategoryFactory {


    public static Category createCategory(String categoryType, String title, String description) {
        return new Category(categoryType, title, description);
    }


    public static Category createCategoryWithProducts(
            String categoryType,
            String title,
            String description,
            int... productIds) {

        Category category = new Category(categoryType, title, description);

        for (int productId : productIds) {
            if (ProductManager.getProductById(productId) != null) {
                category.addProductById(productId);
            }
        }
        return category;
    }
}
