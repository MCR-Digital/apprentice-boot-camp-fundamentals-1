package cards;

public class Deck {
    final PlayingCard[] cards;

    public Deck() {
        this.cards = createDeck();
    }

    public PlayingCard[] createDeck() {
        PlayingCard[] tempCards = new PlayingCard[52];

        int playingCard = 0;
        for (Suit.SUITS suit : Suit.SUITS.values()) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                tempCards[playingCard] = new PlayingCard(
                        faceValue,
                        new Suit(suit)
                );

                playingCard++;
            }
        }

        return tempCards;
    }

    public String[] deckToString() {
        String[] cards = new String[52];

        for (int i = 0; i < 52; i++) {
            cards[i] = this.cards[i].toString();
        }

        return cards;
    }
}
