package cards;

public class Cards {
    public static void main(String[] args) {
        Deck deck = new Deck();

        for(PlayingCard card: deck.cards){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        Deck deck = new Deck();

        return deck.deckToString();
    }
}
