package cards;

import java.util.Arrays;
import java.util.Collections;

public class PlayingCardDeck implements Deck {

    private AbstractPlayingCard[] cards = new AbstractPlayingCard[52];

    public PlayingCardDeck() {
        for (int faceValue = 0; faceValue < 13; faceValue++) {
            cards[0*13 + faceValue] = new ClubPlayingCard(faceValue);
            cards[1*13 + faceValue] = new DiamondPlayingCard(faceValue);
            cards[2*13 + faceValue] = new HeartPlayingCard(faceValue);
            cards[3*13 + faceValue] = new SpadePlayingCard(faceValue);
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(Arrays.asList(cards));
    }

    public String[] getCards() {
        String[] result = new String[cards.length];
        int cardNumber = 0;
        for (AbstractPlayingCard card : cards) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }
        return result;
    }

    @Override
    public Card deal() {
        Card cardToReturn = cards[0];
        cards = Arrays.copyOfRange(cards,1,cards.length);
        return cardToReturn;
    }

    public static void main(String[] args) {
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();
        String[] deckInOrder = playingCardDeck.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }
}
