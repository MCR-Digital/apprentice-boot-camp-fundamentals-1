package cards;

import java.util.Collections;
import java.util.List;

public class Deck<T extends Card> {
    protected final List<T> cards;

    public Deck(List<T> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public String[] getCards() {
        String[] result = new String[this.cards.size()];

        for (int i = 0; i < this.cards.size(); i++) {
            T card = this.cards.get(i);
            result[i] = card.toString();
        }

        return result;
    }

    public T deal() {
        return cards.removeFirst();
    }
}