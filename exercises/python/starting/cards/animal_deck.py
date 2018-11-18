from animal import Animal
from animal_card import AnimalCard
from random import shuffle


class AnimalDeck:
    def __init__(self):
        self.cards = []
        animals = Animal().animals
        for animal in animals:
            self.cards.append(animal)
            self.cards.append(animal)

    def shuffle(self):
        return shuffle(self.cards)

    def deal(self):
        animal = self.cards.pop(0)
        card = AnimalCard(animal)
        return card
