import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Predefined pharmacy items
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Paracetamol", 5.50));
        items.add(new Item("Cough Syrup", 15.00));
        items.add(new Item("Hydralite", 11.50));
        items.add(new Item("Shampoo", 9.25));

        System.out.println("Available items: ");

        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println((i+1) + ". " + item.getName() + " - $" + String.format("%.2f", item.getPrice()));
        }

        // Create a cart
        Cart cart = new Cart();

        // Adding items to the cart
        // cart.addItems(items.get(0));
        // cart.addItems(items.get(3));

        // Display cart contents
        cart.displayCart();

        // Calculate total price
        double total = cart.calculatePrice();
        System.out.println("Total price: $" + String.format("%.2f", total));
    }
}
