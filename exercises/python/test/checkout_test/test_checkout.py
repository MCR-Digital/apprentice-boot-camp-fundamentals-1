import unittest
import checkout


class CheckoutTest(self):
    def __init__(self):
        pass

    def test_one_a(self):
        checkout = Checkout()
        checkout.scan("A")
        self.assertEqual(checkout.total, 50)
