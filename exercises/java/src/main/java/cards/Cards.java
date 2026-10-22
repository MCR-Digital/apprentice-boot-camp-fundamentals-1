package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();

        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        return new PlayingCardDeck().getCards();
    }
}