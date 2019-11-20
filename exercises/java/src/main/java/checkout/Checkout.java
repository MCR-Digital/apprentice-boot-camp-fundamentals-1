package checkout;

import java.util.HashMap;
import java.util.Map;

class Checkout {
    private Stock stock;
    private int total;
    private int numberOfA = 0;
    private int numberOfB = 0;
    private int numberOfC = 0;
    private int numberOfD = 0;
    private Receipt receipt = new Receipt();


    public Checkout() {
        stock = new Stock();
    }

    void scan(String sku) {

        Product scannedProduct = stock.findProduct(sku);

        total += scannedProduct.getPrice();

        if ("A".equals(sku)) {

            receipt.scannedA();
        } else if ("B".equals(sku)) {

            receipt.scannedB();
        } else if ("C".equals(sku)) {

            receipt.scannedC();
        } else if ("D".equals(sku)) {

            receipt.scannedD();
        }
        if ("A".equals(sku)) {
            numberOfA++;
            if (numberOfA % 4 == 0) {
                total -= 20;
            }
        } else if ("B".equals(sku)) {
            numberOfB++;
            if (numberOfB % 2 == 0) {
                total -= 15;
            }
        } else if ("C".equals(sku)) {
            numberOfC++;
            if (numberOfC % 4 == 0) {
                total -= 10;
            }
        } else if ("D".equals(sku)) {
            numberOfD++;
            if (numberOfD % 5 == 0) {
                total -= 15;
            }
        }
    }

    int total() {
        return total;
    }

    public String receipt() {
        return receipt.text();
    }
}
