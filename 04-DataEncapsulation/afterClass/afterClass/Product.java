package afterClass;

public class Product {
    private String name;
    private boolean isVegetarian;

    public Product(String name, boolean isVegetarian) {
        this.name = name;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsVegetarian() {
        return this.isVegetarian;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Carrot", true);
        Product p2 = new Product("ham", false);

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
