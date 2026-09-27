import java.util.*;

public class WishlistTester {

    public static void main(String[] args) {

        // Create a wishlist
        Wishlist wishlist = new Wishlist();

        // Create some dummy products
        Product p1 = new Product("p1", "Laptop");
        Product p2 = new Product("p2", "Keyboard");

        // Test adding products
        wishlist.addOrUpdateProduct(p1, 2);
        wishlist.addOrUpdateProduct(p2, 1);

        System.out.println("Wishlist after adding products:");

        Iterator iterator = wishlist.getIterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Product product = (Product) entry.getKey();
            Integer quantity = (Integer) entry.getValue();

            System.out.println(product.getId() + " - "
                    + product.getName() + " - Quantity: " + quantity);
        }

        // Test updating an existing product
        System.out.println("\nUpdating Laptop quantity from 2 to 5...");

        wishlist.addOrUpdateProduct(p1, 5);

        iterator = wishlist.getIterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Product product = (Product) entry.getKey();
            Integer quantity = (Integer) entry.getValue();

            System.out.println(product.getId() + " - "
                    + product.getName() + " - Quantity: " + quantity);
        }
    }
}
