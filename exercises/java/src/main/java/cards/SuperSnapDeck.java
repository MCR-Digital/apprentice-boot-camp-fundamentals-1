package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperSnapDeck implements Deck{
    private List<Card> deck;

    SuperSnapDeck() {
        AnimalDeck animalDeck = new AnimalDeck();
        PokerDeck pokerDeck = new PokerDeck();
        deck = new ArrayList<>();
        deck.addAll(animalDeck.getCards());
        deck.addAll(pokerDeck.getCards());
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
}
