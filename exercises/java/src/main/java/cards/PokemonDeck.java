package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PokemonDeck implements Deck {

    private List<PokemonCard> cards;

    PokemonDeck() {
        cards = new ArrayList<>();
        for (Pokemon pokemon : Pokemon.values()) {
            cards.add(new PokemonCard(pokemon));
            cards.add(new PokemonCard(pokemon));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            PokemonCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    public PokemonCard deal() {
        return cards.remove(0);
    }
}
