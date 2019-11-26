package checkout;

import java.util.HashMap;
import java.util.Map;

class Checkout {

    private ProductLookup productLookup;
    private SpecialOffersLookup specialOffers;
    private Map<String, Integer> scannedItems;

    private int total;

    private Receipt receipt = new Receipt();


    public Checkout() {
        productLookup = new ProductLookup();
        specialOffers = new SpecialOffersLookup();
        scannedItems = new HashMap<>();
    }

    public Map<String, Integer> getScannedItems() {
        return scannedItems;
    }

    void scan(String sku) {

        // How much does this product cost?
        Product scannedProduct = productLookup.findProduct(sku);

        // Increase the quantity of products purchased
        if(scannedItems.containsKey(sku)) {
            int existingProductQuantity = scannedItems.get(sku);
            existingProductQuantity++;

            scannedItems.replace(sku, existingProductQuantity);
        } else {

            scannedItems.put(sku, 1);
        }

        // How much discount should be deducted from the total?
        Discount qualifyingDiscount = applyDiscounts(scannedProduct);

        adjustTotal(scannedProduct.getPrice(), qualifyingDiscount);

        receipt.addProduct(scannedProduct, qualifyingDiscount, total);

    }

    private Discount applyDiscounts(Product scannedProduct) {

        Discount qualifyingDiscount = null;

        for (Discount discount : specialOffers.getSpecialOffersLookup()) {
            if (scannedProduct.getSku().equals(discount.getSku())) {
                if(scannedItems.get(scannedProduct.getSku()) % discount.getQualifyingQuantity() == 0) {
                    qualifyingDiscount = discount;
                }
            }
        }

        return qualifyingDiscount;

    }

    void adjustTotal(int productAmount, Discount qualifyingDiscount) {

        if(qualifyingDiscount != null) {
            total += (productAmount - qualifyingDiscount.getAmountToDeduct());
        } else {
            total += productAmount;
        }

    }

    int total() {
        return total;
    }

    public String receipt() {
        return receipt.printReceipt(total);
    }
}
