import java.util.ArrayList;

public class Catalog {
    private static final ArrayList<Category> catalog = new ArrayList<>();

    public static void addCategory(Category category) {catalog.add(category);}

    public static void showCategories() {
        int catCount = 0;
        int subCount = 0;

        for (Category c : catalog) {
            c.showInfo();
        }
    }
}
