package checkout;

public class Snippets {
}

  /*
        if ("A".equals(sku)) {

            if (scannedItems.get(sku) % 4 == 0) {
                total -= 20;
            }
        } else if ("B".equals(sku)) {

            if (scannedItems.get(sku) % 2 == 0) {
                total -= 15;
            }
        } else if ("C".equals(sku)) {

            if (scannedItems.get(sku) % 4 == 0) {
                total -= 10;
            }
        } else if ("D".equals(sku)) {

            if (scannedItems.get(sku) % 5 == 0) {
                total -= 15;
            }
        }

   */

   /*
   OLD DISCOUNT METHOD:
    private int applyDiscounts(Product scannedProduct) {
        int amountToDeduct = 0;

        // Apply discounts if qualified
        for (Discount discount : specialOffers.getSpecialOffersLookup()) {

            if(scannedProduct.getSku() == discount.getSku()) {
                if(scannedItems.get(scannedProduct.getSku()) % discount.getQualifyingQuantity() == 0) {

                    amountToDeduct *= (scannedItems.get(scannedProduct.getSku()) / discount.getQualifyingQuantity());

                    adjustTotal(discount.getAmountToDeduct());

                    receipt.receiptHandler(discount.getReceiptText(), total);
                }
            }
        }
    }*/

       /*
    void scannedA() {
        text += "A: 50";
        if (--aCountdown == 0) {
            text += " - 20 (4 for 180)";
            total += 30;
        }
        else {
            total += 50;
        }
        text += "\n";
    }

    void scannedB() {
        text += "B: 30";
        if (--bCountdown == 0) {
            text += " - 15 (2 for 45)";
            total += 15;
        }
        else {
            total += 30;
        }
        text += "\n";
    }

    void scannedC() {
        text += "C: 20\n";
        total += 20;
    }

    void scannedD() {
        text += "D: 15\n";
        total += 15;
    }
    */
