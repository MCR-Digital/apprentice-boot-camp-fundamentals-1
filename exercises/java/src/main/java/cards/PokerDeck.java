package cards;

import java.util.List;

class PokerDeck extends Deck {

    PokerDeck() {
        super();
        for (Suit suit : Suit.values()) {
            cards.add(new PokerCard(suit, new FaceValue("ace")));
            cards.add(new PokerCard(suit, new FaceValue("2")));
            cards.add(new PokerCard(suit, new FaceValue("3")));
            cards.add(new PokerCard(suit, new FaceValue("4")));
            cards.add(new PokerCard(suit, new FaceValue("5")));
            cards.add(new PokerCard(suit, new FaceValue("6")));
            cards.add(new PokerCard(suit, new FaceValue("7")));
            cards.add(new PokerCard(suit, new FaceValue("8")));
            cards.add(new PokerCard(suit, new FaceValue("9")));
            cards.add(new PokerCard(suit, new FaceValue("10")));
            cards.add(new PokerCard(suit, new FaceValue("jack")));
            cards.add(new PokerCard(suit, new FaceValue("queen")));
            cards.add(new PokerCard(suit, new FaceValue("king")));
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
