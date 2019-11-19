package cards;

public interface Deck {

    String [] getCards();

    Card deal();

    void shuffle();
}
