package checkout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptTests {

    @Test
    public void singleItem() {
        Checkout checkout = new Checkout();
        checkout.scan("A");
        assertTrue(
                checkout.receipt().contains(
                "A: 50\n" +
                "Total: 50")
        );
    }

    @Test
    public void oneOfEach() {
        Checkout checkout = new Checkout();
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("C");
        checkout.scan("D");
        assertTrue(
                checkout.receipt().contains(
                "A: 50\n" +
                "B: 30\n" +
                "C: 20\n" +
                "D: 15\n" +
                "Total: 115")
        );
    }

    @Test
    public void offers() {
        Checkout checkout = new Checkout();
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("A");
        checkout.scan("C");
        checkout.scan("D");
        checkout.scan("B");
        assertTrue(
                checkout.receipt().contains(
                "A: 50\n" +
                "A: 50\n" +
                "B: 30\n" +
                "A: 50 - 20 (3 for 130)\n" +
                "C: 20\n" +
                "D: 15\n" +
                "B: 30 - 15 (2 for 45)\n" +
                "Total: 210")
        );
    }
}