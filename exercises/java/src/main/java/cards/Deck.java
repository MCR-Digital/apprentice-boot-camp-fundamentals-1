package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Deck {

    List<Card> cards;

    Deck() {
        cards = new ArrayList<>();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card deal() {
        return cards.remove(0);
    }
}
