from receipt import Receipt


class Checkout:
    def __init__(self):
        self.total = 0
        self.number_of_a = 0
        self.number_of_b = 0
        self.receipt = Receipt()

    def scan(self, sku):
        if sku == 'A':
            self.total += 50
            self.receipt.scanned_a()
        elif sku == 'B':
            self.total += 30
            self.receipt.scanned_b()
        elif sku == "C":
            self.total += 20
            self.receipt.scanned_c()
        elif sku == "D":
            self.total += 15
            self.receipt.scanned_d()

        if sku == 'A':
            self.number_of_a += 1
            if self.number_of_a % 3 == 0:
                self.total -= 20
        elif sku == "B":
            self.number_of_b += 1
            if self.number_of_b % 2 == 0:
                self.total -= 15
