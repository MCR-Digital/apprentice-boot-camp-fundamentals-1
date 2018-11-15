import unittest
from checkout import Checkout


class CheckoutTest(unittest.TestCase):

    def test_one_a(self):
        checkout = Checkout()
        checkout.scan("A")
        self.assertEqual(50, checkout.total)

    def test_two_a(self):
        checkout = Checkout()
        checkout.scan("A")
        checkout.scan("A")
        self.assertEqual(100, checkout.total)

    def test_three_a(self):
        checkout = Checkout()
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("A")
        self.assertEqual(130, checkout.total)

    def test_three_a(self):
        checkout = Checkout()
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("A")
        self.assertEqual(260, checkout.total)

    def test_one_b(self):
        checkout = Checkout()
        checkout.scan("B")
        self.assertEqual(30, checkout.total)

    def test_two_b(self):
        checkout = Checkout()
        checkout.scan("B")
        checkout.scan("B")
        self.assertEqual(45, checkout.total)

    def test_three_b(self):
        checkout = Checkout()
        checkout.scan("B")
        checkout.scan("B")
        checkout.scan("B")
        checkout.scan("B")
        self.assertEqual(90, checkout.total)

    def test_simple(self):
        checkout = Checkout()

        checkout.scan("A")
        self.assertEqual(50, checkout.total)

        checkout.scan("B")
        self.assertEqual(80, checkout.total)

        checkout.scan("C")
        self.assertEqual(100, checkout.total)

        checkout.scan("D")
        self.assertEqual(115, checkout.total)

    def test_incremental(self):
        checkout = Checkout()

        checkout.scan("A")
        self.assertEqual(50, checkout.total)

        checkout.scan("B")
        self.assertEqual(80, checkout.total)

        checkout.scan("A")
        self.assertEqual(130, checkout.total)

        checkout.scan("A")
        self.assertEqual(160, checkout.total)

        checkout.scan("B")
        self.assertEqual(175, checkout.total)

        checkout.scan("C")
        self.assertEqual(195, checkout.total)

        checkout.scan("B")
        self.assertEqual(225, checkout.total)

        checkout.scan("C")
        self.assertEqual(245, checkout.total)

        checkout.scan("D")
        self.assertEqual(260, checkout.total)

        checkout.scan("D")
        self.assertEqual(275, checkout.total)

        checkout.scan("D")
        self.assertEqual(290, checkout.total)

        checkout.scan("C")
        self.assertEqual(310, checkout.total)


if __name__ == "__main__":
    unittest.main()
