import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItems(Item item) {
        items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("Items in your cart: ");
        for (Item item: items) {
            System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
        }
    }

    public double calculatePrice() {
        double total = 0.0;
        for (Item item: items) {
            total += item.getPrice();
        }
        return total;
    }
}
