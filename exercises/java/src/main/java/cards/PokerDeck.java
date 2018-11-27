package cards;

import java.util.ArrayList;
import java.util.List;

class PokerDeck extends Deck {

    PokerDeck() {
        cards = new ArrayList<>();
        for (Suit suit: Suit.values()) {
            for (FaceValue faceValue : FaceValue.values()) {
                cards.add(new PokerCard(suit, faceValue));
            }
        }
    }

    public static void main(String[] args) {
        PokerDeck pokerDeck = new PokerDeck();
        List<Card> deckInOrder = pokerDeck.getCards();
        for(Card card: deckInOrder){
            System.out.println(card);
        }
    }
}
