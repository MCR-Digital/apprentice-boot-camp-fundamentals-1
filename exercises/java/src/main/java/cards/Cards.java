package cards;

public class Cards {
    public static void main(String[] args) {
        PlayingCardDeck deck = new PlayingCardDeck();

        for(PlayingCard card: deck.cards){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        PlayingCardDeck deck = new PlayingCardDeck();

        return deck.deckToString();
    }
}
