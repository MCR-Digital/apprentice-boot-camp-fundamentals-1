package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnimalDeck implements Deck {

    private List<AnimalCard> cards;

    AnimalDeck() {
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            AnimalCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    public AnimalCard deal() {
        return cards.remove(0);
    }
}
