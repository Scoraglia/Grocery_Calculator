import java.util.Scanner;

public class GroceryApp {

        private GroceryList groceryList;
        private Scanner input;

        public GroceryApp() {
            groceryList = new GroceryList();
            input = new Scanner(System.in);

            // Add some default items
            groceryList.addItem(new GroceryItem("Milk", 2.49f));
            groceryList.addItem(new GroceryItem("Eggs", 3.25f));
            groceryList.addItem(new GroceryItem("Bread", 1.99f));
            groceryList.addItem(new GroceryItem("Butter", 4.50f));
        }

        public void run() {
            String userInput;

            System.out.println("=== Welcome to the Grocery Store ===");

            while (true) {
                System.out.print("\nType 'list' to see items, 'exit' to quit: ");
                userInput = input.nextLine();

                if (userInput.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    break;
                } else if (userInput.equalsIgnoreCase("list")) {
                    groceryList.displayItems();
                } else {
                    System.out.println("Unknown command.");
                }
            }

            input.close();
        }
}


