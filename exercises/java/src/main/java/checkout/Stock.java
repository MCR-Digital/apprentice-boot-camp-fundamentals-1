package checkout;

import java.util.HashMap;
import java.util.Map;

public class Stock {

    private Map<String, Integer> productLookup;

    public Stock() {
        populateProductLookup();
    }

    private void populateProductLookup() {

        productLookup = new HashMap<>();

        productLookup.put("A", 50);
        productLookup.put("B", 30);
        productLookup.put("C", 20);
        productLookup.put("D", 15);
    }

    private Product createStockItem(String sku, int price) {

        return new Product(sku, price);
    }

    public Product findProduct(String sku) {

        int scannedProductPrice = scannedProductPrice = productLookup.get(sku);

        Product stockItem = createStockItem(sku, scannedProductPrice);

        return stockItem;
    }

}
