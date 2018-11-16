import unittest

from receipt import Receipt
from checkout import Checkout


class ReceiptTest(unittest.TestCase):
    def test_single_item(self):
        checkout = Checkout()
        checkout.scan("A")
        print(checkout.receipt_text())
        self.assertIn("A: 50\nTotal: 50", checkout.receipt_text())

    def test_one_of_each(self):
        checkout = Checkout()
        checkout.scan("A")
        checkout.scan("B")
        checkout.scan("C")
        checkout.scan("D")
        self.assertEqual(checkout.receipt_text(),
                         "A: 50\nB: 30\nC: 20\nD: 15\nTotal: 115")


//TODO THIS IS FAILING


def test_offers(self):
        checkout = Checkout()
        checkout.scan("A")
        checkout.scan("A")
        checkout.scan("B")
        checkout.scan("A")
        checkout.scan("C")
        checkout.scan("D")
        checkout.scan("B")
        self.assertEqual(checkout.receipt_text(),
                         "A: 50\nA: 50\nB: 30\nA: 50 - 20 (3 for 130)\nC: 20\nD: 15\nB: 30 - 15 (2 for 45)\nTotal: 210")


if __name__ == "__main__":
    unittest.main()
