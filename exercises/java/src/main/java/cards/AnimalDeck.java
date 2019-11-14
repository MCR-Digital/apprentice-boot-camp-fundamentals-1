package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnimalDeck {

    private List<Card> cards;

    AnimalDeck() {
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

    void shuffle() {
        Collections.shuffle(cards);
    }

    String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    Card deal() {
        return cards.remove(0);
    }
}
