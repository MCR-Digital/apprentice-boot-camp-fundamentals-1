package cards;

import java.util.Collections;
import java.util.List;

public class Deck {
    protected final List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public String[] getCards() {
        String[] result = new String[this.cards.size()];

        for (int i = 0; i < this.cards.size(); i++) {
            Card card = this.cards.get(i);
            result[i] = card.toString();
        }

        return result;
    }

    public Card deal() {
        return cards.removeFirst();
    }
}