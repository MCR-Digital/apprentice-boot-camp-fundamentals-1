from suit import Suit
from random import shuffle
from card import Card


class Deck:
    def __init__(self):
        self.suits = ["hearts", "diamonds", "clubs", "spades"]
        self.cards = []

    def make_deck(self):
        for suit_name in self.suits:
            suit = Suit(suit_name)
            suit_cards = suit.make_cards_for_suit()
            self.cards += suit_cards

    def shuffle(self):
        return shuffle(self.cards)


# deck = Deck()
# deck.make_deck()
# print(deck.cards)
