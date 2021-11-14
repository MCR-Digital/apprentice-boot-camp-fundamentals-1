package cards;

public class SpadePlayingCard extends AbstractPlayingCard {

    public SpadePlayingCard(int faceValue) {
        super(faceValue);
    }

    @Override
    Suit getSuit() {
        return Suit.SPADES;
    }
}
