class Card:
    def __init__(self, suit, face_value):
        self.suit = suit
        self.face_value = face_value
        self.full_name = make_name_string()

    def make_name_string(self):
        return self.face_value + " of " + self.suit
