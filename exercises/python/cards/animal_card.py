class AnimalCard:
    def __init__(self, animal):
        self.animal = animal

    def snap(self, other_card):

        return other_card is not None and self.animal == other_card.animal
