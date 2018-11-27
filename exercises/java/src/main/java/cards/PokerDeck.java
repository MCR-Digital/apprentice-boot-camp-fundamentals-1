package cards;

import java.util.List;

class PokerDeck extends Deck {

    PokerDeck() {
        super();
        for (Suit suit : Suit.values()) {
            cards.add(new PokerCard(suit,"ace"));
            cards.add(new PokerCard(suit,"2"));
            cards.add(new PokerCard(suit,"3"));
            cards.add(new PokerCard(suit,"4"));
            cards.add(new PokerCard(suit,"5"));
            cards.add(new PokerCard(suit,"6"));
            cards.add(new PokerCard(suit,"7"));
            cards.add(new PokerCard(suit,"8"));
            cards.add(new PokerCard(suit,"9"));
            cards.add(new PokerCard(suit,"10"));
            cards.add(new PokerCard(suit,"jack"));
            cards.add(new PokerCard(suit,"queen"));
            cards.add(new PokerCard(suit,"king"));
        }
    }

    public static void main(String[] args) {
        PokerDeck pokerDeck = new PokerDeck();
        List<Card> deckInOrder = pokerDeck.getCards();
        for (Card card : deckInOrder) {
            System.out.println(card);
        }
    }
}
