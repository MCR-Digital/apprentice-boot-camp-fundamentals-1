package checkout;

import java.util.HashMap;
import java.util.Map;

public class ProductLookup {

    private Map<String, Integer> productLookup;

    public ProductLookup() {
        populateProductLookup();
    }

    public void populateProductLookup() {

        productLookup = new HashMap<>();

        productLookup.put("A", 50);
        productLookup.put("B", 30);
        productLookup.put("C", 20);
        productLookup.put("D", 15);
    }

    public Product findProduct(String sku) {

        int scannedProductPrice  = productLookup.get(sku);

        return new Product(sku, scannedProductPrice);
    }

}
