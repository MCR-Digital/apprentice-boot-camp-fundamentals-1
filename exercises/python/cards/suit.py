from card import Card


class Suit:
    def __init__(self, name):
        self.name = name
        self.card_types = ["ace", "2", "3", "4", "5", "6", "7",
                           "8", "9", "10", "jack", "queen", "king"]

    def make_cards_for_suit(self):
        suit_of_cards = []
        for card_type in self.card_types:
            card = Card(self.name, card_type)
            suit_of_cards.append(card)
        return suit_of_cards
