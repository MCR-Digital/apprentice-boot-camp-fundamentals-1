from animal import Animal
from random import shuffle


class AnimalDeck:
    def __init__(self):
        self.cards = []
        animals = Animal().animals
        for animal in animals:
            self.cards.append(animal)
            self.cards.append(animal)

    def shuffle(self):
        return (self.cards)

    def deal(self):
        return self.cards.pop(0)
