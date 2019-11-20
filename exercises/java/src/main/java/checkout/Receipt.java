package checkout;

public class Receipt {

    private String text = "";
    private int aCountdown = 3;
    private int total;
    private int bCountdown = 2;

    String text() {
        return text + "Total: " + total;
    }

    void printToReceipt(Product product) {

        StringBuilder receiptText = new StringBuilder();
        receiptText.append(product.getSku() + ": " + product.getPrice());
        //text += "A: 50";
        if (--aCountdown == 0) {
            receiptText.append(" - 20 (4 for 180)");
            total += 30;
        }
        else {
            total += 50;
        }
        receiptText.append("\n");

    }

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
}
