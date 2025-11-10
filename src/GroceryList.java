import java.util.ArrayList;

public class GroceryList {

        private ArrayList<GroceryItem> items = new ArrayList<>();

        public void addItem(GroceryItem item) {
            items.add(item);
        }

        public void displayItems() {
            System.out.println("\nAvailable Grocery Items:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
        }

        public GroceryItem getItem(int index) {
            if (index >= 0 && index < items.size()) {
                return items.get(index);
            }
            return null;
        }

        public int size() {
            return items.size();
        }
    }
