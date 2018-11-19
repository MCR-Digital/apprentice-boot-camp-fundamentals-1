from suit import Suit
from random import shuffle
from card import Card


class Deck:
    def __init__(self):
        self.suits = ["hearts", "diamonds", "clubs", "spades"]
        self.cards = self.make_deck()

    def make_deck(self):
        cards = []
        for suit_name in self.suits:
            suit = Suit(suit_name)
            suit_cards = suit.make_cards_for_suit()
            cards += suit_cards
        return cards

    def shuffle(self):
        return shuffle(self.cards)

    def deal(self):
        card = self.cards.pop(0)
        return card
