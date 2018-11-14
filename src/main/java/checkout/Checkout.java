package checkout;

class Checkout {
    private int total;
    private int numberOfA = 0;
    private int numberOfB = 0;
    private Receipt receipt = new Receipt();

    void scan(String sku) {
        if ("A".equals(sku)) {
            total += 50;
            receipt.scannedA();
        } else if ("B".equals(sku)) {
            total += 30;
            receipt.scannedB();
        } else if ("C".equals(sku)) {
            total += 20;
            receipt.scannedC();
        } else if ("D".equals(sku)) {
            total += 15;
            receipt.scannedD();
        }
        if ("A".equals(sku)) {
            numberOfA++;
            if (numberOfA % 3 == 0) {
                total -= 20;
            }
        } else if ("B".equals(sku)) {
            numberOfB++;
            if (numberOfB % 2 == 0) {
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
