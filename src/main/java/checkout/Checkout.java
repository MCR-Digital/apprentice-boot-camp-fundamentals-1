package checkout;

class Checkout {
    private int total;
    private int numberOfA = 0;
    private int numberOfB = 0;

    void scan(String sku) {
        if ("A".equals(sku)) {
            total += 50;
        } else if ("B".equals(sku)) {
            total += 30;
        } else if ("C".equals(sku)) {
            total += 20;
        } else if ("D".equals(sku)) {
            total += 15;
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
}
