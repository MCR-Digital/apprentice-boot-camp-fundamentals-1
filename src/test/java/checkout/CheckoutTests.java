package checkout;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutTests {

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

    @Test
    public void incremental() {
        Checkout checkout = new Checkout();
        
        checkout.scan("A");
        assertThat(checkout.total()).isEqualTo( 50);
        
        checkout.scan("B");
        assertThat(checkout.total()).isEqualTo( 80);
        
        checkout.scan("A");
        assertThat(checkout.total()).isEqualTo(130);
        
        checkout.scan("A");
        assertThat(checkout.total()).isEqualTo(160);
        
        checkout.scan("B");
        assertThat(checkout.total()).isEqualTo(175);
        
        checkout.scan("C");
        assertThat(checkout.total()).isEqualTo(195);
        
        checkout.scan("B");
        assertThat(checkout.total()).isEqualTo(225);
        
        checkout.scan("C");
        assertThat(checkout.total()).isEqualTo(245);
        
        checkout.scan("D");
        assertThat(checkout.total()).isEqualTo(260);
        
        checkout.scan("D");
        assertThat(checkout.total()).isEqualTo(275);
        
        checkout.scan("D");
        assertThat(checkout.total()).isEqualTo(290);
        
        checkout.scan("C");
        assertThat(checkout.total()).isEqualTo(310);
    }
}
