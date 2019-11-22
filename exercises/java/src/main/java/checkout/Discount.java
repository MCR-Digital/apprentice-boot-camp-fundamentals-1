package checkout;

public class Discount {

    private String sku;
    private int qualifyingQuantity;
    private int amountToDeduct;
    private String receiptText;

    public Discount(String sku, int qualifyingQuantity, int amountToDeduct, String receiptText) {
        this.sku = sku;
        this.qualifyingQuantity = qualifyingQuantity;
        this.amountToDeduct = amountToDeduct;
        this.receiptText = receiptText;
    }

    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getQualifyingQuantity() {
        return qualifyingQuantity;
    }
    public void setQualifyingQuantity(int qualifyingQuantity) {
        this.qualifyingQuantity = qualifyingQuantity;
    }

    public String getReceiptText() {
        return receiptText;
    }
    public void setReceiptText(String receiptText) {
        this.receiptText = receiptText;
    }

    public int getAmountToDeduct() {
        return amountToDeduct;
    }
    public void setAmountToDeduct(int amountToDeduct) {
        this.amountToDeduct = amountToDeduct;
    }
}
