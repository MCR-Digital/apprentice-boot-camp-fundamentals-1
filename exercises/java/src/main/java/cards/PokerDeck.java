package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerDeck implements Deck {

    private List<Card> deck;

    PokerDeck() {
        deck = new ArrayList<>();
        for (Suit suit: Suit.values()) {
            for (FaceValue faceValue : FaceValue.values()) {
                deck.add(new PokerCard(suit, faceValue));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(deck);
    }

    @Override
    public List<Card> getCards() {
        return deck;
    }

    @Override
    public Card deal() {
        return deck.remove(0);
    }

    public static void main(String[] args) {
        PokerDeck pokerDeck = new PokerDeck();
        List<Card> deckInOrder = pokerDeck.getCards();
        for(Card card: deckInOrder){
            System.out.println(card);
        }
    }
}
