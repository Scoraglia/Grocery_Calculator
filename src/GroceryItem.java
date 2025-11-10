public class GroceryItem {

    private String name;
    private float price;

    // Constructor
    public GroceryItem(String name, float price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    // For easy printing
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
