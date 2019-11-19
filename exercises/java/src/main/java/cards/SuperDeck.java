package cards;

import java.util.ArrayList;
import java.util.Collections;

public class SuperDeck implements Deck {

    public AnimalDeck animalDeck = new AnimalDeck();
    public PlayingCardDeck playingCardDeck = new PlayingCardDeck();

    public ArrayList<Card> cards;

    public SuperDeck() {
        cards = new ArrayList<>();

        for (int i = 0; i < animalDeck.getCards().length; i++) {
            cards.add(animalDeck.deal());
        }

        for (int i = 0; i < playingCardDeck.getCards().length; i++) {
            cards.add(playingCardDeck.deal());
        }
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public Card deal()  {
        return cards.remove(0);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
