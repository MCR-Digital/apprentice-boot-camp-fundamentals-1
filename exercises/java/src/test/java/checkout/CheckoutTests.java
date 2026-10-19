package checkout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutTests {

    @Test
    public void oneA() {
        Checkout checkout = new Checkout();

        checkout.scan("A");
        assertEquals(50, checkout.total());
    }

    @Test
    public void twoA() {
        Checkout checkout = new Checkout();

        checkout.scan("A");
        checkout.scan("A");
        assertEquals(100, checkout.total());
    }

    @Test
    public void threeA() {
        Checkout checkout = new Checkout();

        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        assertEquals(130, checkout.total());
    }


    @Test
    public void sixA() {
        Checkout checkout = new Checkout();

        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        assertEquals(260, checkout.total());
    }

    @Test
    public void oneB() {
        Checkout checkout = new Checkout();

        checkout.scan("B");
        assertEquals(30, checkout.total());
    }

    @Test
    public void twoB() {
        Checkout checkout = new Checkout();

        checkout.scan("B");
        checkout.scan("B");
        assertEquals(45, checkout.total());
    }

    @Test
    public void fourB() {
        Checkout checkout = new Checkout();

        checkout.scan("B");
        checkout.scan("B");
        checkout.scan("B");
        checkout.scan("B");
        assertEquals(90, checkout.total());
    }

    @Test
    public void simple() {
        Checkout checkout = new Checkout();

        checkout.scan("A");
        assertEquals(50, checkout.total());

        checkout.scan("B");
        assertEquals(80, checkout.total());

        checkout.scan("C");
        assertEquals(100, checkout.total());

        checkout.scan("D");
        assertEquals(115, checkout.total());
    }
}