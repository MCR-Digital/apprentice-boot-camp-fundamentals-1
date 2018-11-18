class Receipt:
    def __init__(self):
        self.text = ""
        self.total = 0
        self.a_countdown = 3
        self.b_countdown = 2

    def scanned_a(self):
        self.text += "A: 50"
        self.a_countdown -= 1
        if self.a_countdown == 0:
            self.text += " - 20 (3 for 130)"
            self.total += 30
        else:
            self.total += 50
        self.text += "\n"

    def scanned_b(self):
        self.text += "B: 30"
        self.b_countdown -= 1
        if self.b_countdown == 0:
            self.text += " - 15 (2 for 45)"
            self.total += 15
        else:
            self.total += 30
        self.text += "\n"

    def scanned_c(self):
        self.text += "C: 20\n"
        self.total += 20

    def scanned_d(self):
        self.text += "D: 15\n"
        self.total += 15

    def get_text(self):
        return '{text}Total: {total}'.format(text=self.text, total=self.total)
