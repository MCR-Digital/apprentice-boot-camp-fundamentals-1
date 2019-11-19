package cards;

import java.util.ArrayList;
import java.util.Collections;

public class PlayingCardDeck implements Deck {

    public ArrayList<PlayingCard> cards = new ArrayList<>();

    public PlayingCardDeck() {
        for (Suit suit : Suit.values()) {

            for (int faceValue = 0; faceValue < 13; faceValue++) {

                String faceValueName;
                switch (faceValue) {
                    case 0:
                        faceValueName = "ace";
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        faceValueName = Integer.toString(faceValue + 1);
                        break;
                    case 10:
                        faceValueName = "jack";
                        break;
                    case 11:
                        faceValueName = "queen";
                        break;
                    case 12:
                        faceValueName = "king";
                        break;
                    default:
                        throw new IllegalArgumentException("Something went wrong " + faceValue + "is not a valid faceValue!");
                }

                cards.add(new PlayingCard(faceValue, faceValueName, suit));
            }

        }
    }

    public String [] getCards() {

        String [] result = new String [cards.size()];

        for (int i = 0; i < cards.size() ; i++) {

            result[i] = cards.get(i).getFaceValueName() + " of " + cards.get(i).getSuit().toString().toLowerCase();
        }

        return result;
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

}
