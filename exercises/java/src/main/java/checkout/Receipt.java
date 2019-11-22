package checkout;

public class Receipt {

    private String lineItem;
    private String receiptBody;

    private int total;

    private String receipt;

    public void receiptHandler(Product scannedProduct, Discount qualifyingDiscount, int incomingTotal) {

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

        total = incomingTotal;

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

    public String printReceipt() {

        StringBuilder finalReceiptBuilder = new StringBuilder();

        finalReceiptBuilder.append(receiptBody);
        finalReceiptBuilder.append("Total: " + total);

        receipt = finalReceiptBuilder.toString();

        System.out.println(receipt);

        return receipt;
    }

}
