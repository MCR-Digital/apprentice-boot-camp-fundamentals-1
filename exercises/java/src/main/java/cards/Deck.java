package cards;

public interface Deck {
    void shuffle();
    String[] getCards();
    Card deal();
}
