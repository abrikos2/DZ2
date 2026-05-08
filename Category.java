import java.util.ArrayList;
import java.util.HashMap;

public class Category {
    private static int idgen = 1;
    private int id;
    private String title;
    private String description;
    public String categoryType;
    public static ArrayList<Object[]> productList = new ArrayList<>();
    
    public static void addProduct(String title, double price, String description){productList.add(new Object[]{title, price, description});}
    public static ArrayList<Object[]> getProduct(){return productList;}
    
    public Category(String categoryType, String title, String description) {
        this.id = idgen++;
        this.title = title;
        this.description = description;
        this.categoryType = categoryType;
    }

    public void showInfo() {
        System.out.println(this.categoryType + " - " + title + "\n"  + "\n" + "ID: " + id + "\n" + "Описание: " + description + "\n");
    }
    
    public static Category createCategoryFromArray(String[] data){
        return new Category(data[0], data[1], data[3]);
    }
    public int getID() {return this.id;}
    public int setID(int id) {return this.id = id;}

    public String getTitle() {return this.title;}
    public String setTitle(String title) {return this.title = title;}

    public String getDescription() {return this.description;}
    public String setDescription(String description) {return this.description = description;}
    
}
