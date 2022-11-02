package checkout;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CheckoutTests {

    @Test
    public void oneA() {
        Checkout checkout = new Checkout();

        checkout.scan("A");
        assertThat(checkout.total()).isEqualTo(50);
    }

    @Test
    public void twoA() {
        Checkout checkout = new Checkout();

        checkout.scan("A");
        checkout.scan("A");
        assertThat(checkout.total()).isEqualTo(100);
    }

    @Test
    public void threeA() {
        Checkout checkout = new Checkout();

        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        assertThat(checkout.total()).isEqualTo(130);
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
        assertThat(checkout.total()).isEqualTo(260);
    }

    @Test
    public void oneB() {
        Checkout checkout = new Checkout();

        checkout.scan("B");
        assertThat(checkout.total()).isEqualTo(30);
    }

    @Test
    public void twoB() {
        Checkout checkout = new Checkout();

        checkout.scan("B");
        checkout.scan("B");
        assertThat(checkout.total()).isEqualTo(45);
    }

    @Test
    public void fourB() {
        Checkout checkout = new Checkout();

        checkout.scan("B");
        checkout.scan("B");
        checkout.scan("B");
        checkout.scan("B");
        assertThat(checkout.total()).isEqualTo(90);
    }

    @Test
    public void simple() {
        Checkout checkout = new Checkout();
        
        checkout.scan("A");
        assertThat(checkout.total()).isEqualTo( 50);
        
        checkout.scan("B");
        assertThat(checkout.total()).isEqualTo( 80);
        
        checkout.scan("C");
        assertThat(checkout.total()).isEqualTo(100);
        
        checkout.scan("D");
        assertThat(checkout.total()).isEqualTo(115);
    }
}
