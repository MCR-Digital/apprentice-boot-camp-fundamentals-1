package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MixedDeck implements Deck {

    private List<Card> cards = new ArrayList<>();

    public MixedDeck() {
        Deck animalDeck = new AnimalDeck();
        Deck playingCardDeck = new PlayingCardDeck();
        for(int cardNo=0; cardNo<52; cardNo++) {
            cards.add(animalDeck.deal());
            cards.add(playingCardDeck.deal());
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for(int cardIndex=0; cardIndex<cards.size(); cardIndex++){
            result[cardIndex] = cards.get(0).toString();
        }
        return result;
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }
}
