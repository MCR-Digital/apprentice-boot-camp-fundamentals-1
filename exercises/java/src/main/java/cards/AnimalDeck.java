package cards;

import java.util.ArrayList;

class AnimalDeck extends Deck {
    public AnimalDeck() {
        super(new ArrayList<>());

        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }
}