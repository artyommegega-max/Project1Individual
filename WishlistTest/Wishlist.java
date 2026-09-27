import java.util.*;

public class Wishlist {

    private Map<Product, Integer> products;

    public Wishlist() {
        products = new HashMap<>();
    }

    public void addOrUpdateProduct(Product product, int quantity) {
        Product existingProduct = null;

        for (Product p : products.keySet()) {
            if (p.getId().equals(product.getId())) {
                existingProduct = p;
                break;
            }
        }

        if (existingProduct != null) {
            products.put(existingProduct, quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public Iterator getIterator() {
        return products.entrySet().iterator();
    }
}
