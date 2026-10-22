package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements Deck {
    List<PlayingCard> cards;

    PlayingCardDeck() {
        this.cards = new ArrayList<>();

        Suit[] suits = {
                new Suit("clubs"),
                new Suit("diamonds"),
                new Suit("hearts"),
                new Suit("spades")
        };

        for (Suit suit : suits) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                this.cards.add(new PlayingCard(faceValue, suit));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];

        for (int i = 0; i < cards.size(); i++) {
            PlayingCard card = cards.get(i);
            result[i] = card.toString();
        }

        return result;
    }

    @Override
    public PlayingCard deal() {
        return cards.removeFirst();
    }

    @Override
    public String toString() {
        return this.cards.toString();
    }
}