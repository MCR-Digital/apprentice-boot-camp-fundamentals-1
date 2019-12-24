package checkout;

public class Receipt {

    private String lineItem;
    private String receiptBody;

    public void addProduct(Product scannedProduct, Discount qualifyingDiscount, int incomingTotal) {

        StringBuilder lineItemBuilder = new StringBuilder();

        if (qualifyingDiscount != null) {

            lineItemBuilder.append(scannedProduct.getSku());
            lineItemBuilder.append(": ");
            lineItemBuilder.append(scannedProduct.getPrice());
            lineItemBuilder.append(qualifyingDiscount.getReceiptText());

        } else {
            lineItemBuilder.append(scannedProduct.getSku());
            lineItemBuilder.append(": ");
            lineItemBuilder.append(scannedProduct.getPrice());
        }

        lineItem = lineItemBuilder.toString();

        printLineItem();
    }

    private void printLineItem() {

        StringBuilder receiptBodyBuilder = new StringBuilder();

        receiptBodyBuilder.append(lineItem);
        receiptBodyBuilder.append("\n");

        if(receiptBody != null){
            receiptBody += receiptBodyBuilder.toString();
        } else {
         receiptBody = receiptBodyBuilder.toString();
        }
    }

    public String printReceipt(int incomingTotal) {

        StringBuilder finalReceiptBuilder = new StringBuilder();

        finalReceiptBuilder.append(receiptBody);
        finalReceiptBuilder.append("Total: " + incomingTotal);

        return finalReceiptBuilder.toString();
    }

}
