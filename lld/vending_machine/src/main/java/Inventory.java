import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> productStock = new HashMap<>();
    private Map<String, Product> productCatalog = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        productCatalog.put(product.getName(), product);
        productStock.put(product.getName(), productStock.getOrDefault(product.getName(), 0) + quantity);
    }

    public boolean isAvailable(String productName) {
        return productStock.getOrDefault(productName, 0) > 0;
    }

    public void reduceProduct(String productName) {
        if (isAvailable(productName)) {
            productStock.put(productName, productStock.get(productName) - 1);
        }
    }

    public Product getProduct(String productName) {
        return productCatalog.get(productName);
    }
}
