package cards;

import java.util.ArrayList;

public interface Deck {

    String [] getCards();

    Card deal();

    void shuffle();
}
