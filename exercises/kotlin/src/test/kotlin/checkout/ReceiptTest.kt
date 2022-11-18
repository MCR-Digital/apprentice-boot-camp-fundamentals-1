package checkout

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReceiptTest {
    @Test
    fun singleItem() {
        val checkout = Checkout()
        checkout.scan("A")
        assertTrue(checkout.receipt().contains("A: 50\n"))
        assertTrue(checkout.receipt().contains("Total: 50"))
    }

    @Test
    fun oneOfEach() {
        val checkout = Checkout()
        checkout.scan("A")
        assertTrue(checkout.receipt().contains("A: 50\n"))
        checkout.scan("B")
        assertTrue(checkout.receipt().contains("B: 30\n"))
        checkout.scan("C")
        assertTrue(checkout.receipt().contains("C: 20\n"))
        checkout.scan("D")
        assertTrue(checkout.receipt().contains("D: 15\n"))
        assertTrue(checkout.receipt().contains("Total: 115"))
    }

    @Test
    fun offers() {
        val checkout = Checkout()
        checkout.scan("A")
        assertTrue(checkout.receipt().contains("A: 50\n"))
        checkout.scan("A")
        assertTrue(checkout.receipt().contains("A: 50\n"))
        checkout.scan("B")
        assertTrue(checkout.receipt().contains("B: 30\n"))
        checkout.scan("A")
        assertTrue(checkout.receipt().contains("A: 50 - 20 (3 for 130)\n"))
        checkout.scan("C")
        assertTrue(checkout.receipt().contains("B: 30\n"))
        checkout.scan("D")
        assertTrue(checkout.receipt().contains("D: 15\n"))
        checkout.scan("B")
        assertTrue(checkout.receipt().contains("B: 30 - 15 (2 for 45)\n"))
    }
}