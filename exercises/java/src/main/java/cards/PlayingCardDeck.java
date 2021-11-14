package cards;

import java.util.Arrays;
import java.util.Collections;

public class PlayingCardDeck implements Deck {

    private AbstractPlayingCard[] cards = new AbstractPlayingCard[52];

    public PlayingCardDeck() {
        int cardIndex = 0;
        cards[cardIndex++] = new AceOfClubsPlayingCard();
        cards[cardIndex++] = new TwoOfClubsPlayingCard();
        cards[cardIndex++] = new ThreeOfClubsPlayingCard();
        cards[cardIndex++] = new FourOfClubsPlayingCard();
        cards[cardIndex++] = new FiveOfClubsPlayingCard();
        cards[cardIndex++] = new SixOfClubsPlayingCard();
        cards[cardIndex++] = new SevenOfClubsPlayingCard();
        cards[cardIndex++] = new EightOfClubsPlayingCard();
        cards[cardIndex++] = new NineOfClubsPlayingCard();
        cards[cardIndex++] = new TenOfClubsPlayingCard();
        cards[cardIndex++] = new JackOfClubsPlayingCard();
        cards[cardIndex++] = new QueenOfClubsPlayingCard();
        cards[cardIndex++] = new KingOfClubsPlayingCard();
        cards[cardIndex++] = new AceOfDiamondsPlayingCard();
        cards[cardIndex++] = new TwoOfDiamondsPlayingCard();
        cards[cardIndex++] = new ThreeOfDiamondsPlayingCard();
        cards[cardIndex++] = new FourOfDiamondsPlayingCard();
        cards[cardIndex++] = new FiveOfDiamondsPlayingCard();
        cards[cardIndex++] = new SixOfDiamondsPlayingCard();
        cards[cardIndex++] = new SevenOfDiamondsPlayingCard();
        cards[cardIndex++] = new EightOfDiamondsPlayingCard();
        cards[cardIndex++] = new NineOfDiamondsPlayingCard();
        cards[cardIndex++] = new TenOfDiamondsPlayingCard();
        cards[cardIndex++] = new JackOfDiamondsPlayingCard();
        cards[cardIndex++] = new QueenOfDiamondsPlayingCard();
        cards[cardIndex++] = new KingOfDiamondsPlayingCard();
        cards[cardIndex++] = new AceOfHeartsPlayingCard();
        cards[cardIndex++] = new TwoOfHeartsPlayingCard();
        cards[cardIndex++] = new ThreeOfHeartsPlayingCard();
        cards[cardIndex++] = new FourOfHeartsPlayingCard();
        cards[cardIndex++] = new FiveOfHeartsPlayingCard();
        cards[cardIndex++] = new SixOfHeartsPlayingCard();
        cards[cardIndex++] = new SevenOfHeartsPlayingCard();
        cards[cardIndex++] = new EightOfHeartsPlayingCard();
        cards[cardIndex++] = new NineOfHeartsPlayingCard();
        cards[cardIndex++] = new TenOfHeartsPlayingCard();
        cards[cardIndex++] = new JackOfHeartsPlayingCard();
        cards[cardIndex++] = new QueenOfHeartsPlayingCard();
        cards[cardIndex++] = new KingOfHeartsPlayingCard();
        cards[cardIndex++] = new AceOfSpadesPlayingCard();
        cards[cardIndex++] = new TwoOfSpadesPlayingCard();
        cards[cardIndex++] = new ThreeOfSpadesPlayingCard();
        cards[cardIndex++] = new FourOfSpadesPlayingCard();
        cards[cardIndex++] = new FiveOfSpadesPlayingCard();
        cards[cardIndex++] = new SixOfSpadesPlayingCard();
        cards[cardIndex++] = new SevenOfSpadesPlayingCard();
        cards[cardIndex++] = new EightOfSpadesPlayingCard();
        cards[cardIndex++] = new NineOfSpadesPlayingCard();
        cards[cardIndex++] = new TenOfSpadesPlayingCard();
        cards[cardIndex++] = new JackOfSpadesPlayingCard();
        cards[cardIndex++] = new QueenOfSpadesPlayingCard();
        cards[cardIndex++] = new KingOfSpadesPlayingCard();
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
