from card import Card


class Suit:
    def __init__(self, name):
        self.name = name
        self.card_types = ["ace", "2", "3", "4", "5", "6", "7",
                           "8", "9", "10", "jack", "queen", "king"]

    def make_cards_for_suit(self):
        suit_of_cards = []
        for card in self.card_types:
            full_card_name = card + " of " + self.name
            suit_of_cards.append(full_card_name)
        return suit_of_cards
