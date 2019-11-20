package checkout;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(checkout.total()).isEqualTo(150);
    }

    @Test
    public void fourA() {
        Checkout checkout = new Checkout();

        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        assertThat(checkout.total()).isEqualTo(180);
    }

    @Test
    public void eightA() {
        Checkout checkout = new Checkout();

        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        assertThat(checkout.total()).isEqualTo(360);
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
    public void oneC() {
        Checkout checkout = new Checkout();

        checkout.scan("C");
        assertThat(checkout.total()).isEqualTo(20);
    }

    @Test
    public void twoC() {
        Checkout checkout = new Checkout();

        checkout.scan("C");
        checkout.scan("C");
        assertThat(checkout.total()).isEqualTo(40);
    }

    @Test
    public void threeC() {
        Checkout checkout = new Checkout();

        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        assertThat(checkout.total()).isEqualTo(60);
    }

    @Test
    public void fourC() {
        Checkout checkout = new Checkout();

        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        assertThat(checkout.total()).isEqualTo(70);
    }

    @Test
    public void eightC() {
        Checkout checkout = new Checkout();

        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        checkout.scan("C");
        assertThat(checkout.total()).isEqualTo(140);
    }

    @Test
    public void oneD() {
        Checkout checkout = new Checkout();

        checkout.scan("D");
        assertThat(checkout.total()).isEqualTo(15);
    }

    @Test
    public void twoD() {
        Checkout checkout = new Checkout();

        checkout.scan("D");
        checkout.scan("D");
        assertThat(checkout.total()).isEqualTo(30);
    }

    @Test
    public void threeD() {
        Checkout checkout = new Checkout();

        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        assertThat(checkout.total()).isEqualTo(45);
    }

    @Test
    public void fourD() {
        Checkout checkout = new Checkout();

        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        assertThat(checkout.total()).isEqualTo(60);
    }

    @Test
    public void fiveD() {
        Checkout checkout = new Checkout();

        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        assertThat(checkout.total()).isEqualTo(60);
    }

    @Test
    public void tenD() {
        Checkout checkout = new Checkout();

        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        checkout.scan("D");
        assertThat(checkout.total()).isEqualTo(120);
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
