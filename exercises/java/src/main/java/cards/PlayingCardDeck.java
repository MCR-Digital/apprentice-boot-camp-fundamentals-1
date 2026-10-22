package cards;

import java.util.ArrayList;

public class PlayingCardDeck extends Deck {
    PlayingCardDeck() {
        super(new ArrayList<>());

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
    public String toString() {
        return cards.toString();
    }
}