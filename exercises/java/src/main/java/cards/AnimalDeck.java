package cards;

class AnimalDeck extends Deck{

    AnimalDeck() {
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

}
