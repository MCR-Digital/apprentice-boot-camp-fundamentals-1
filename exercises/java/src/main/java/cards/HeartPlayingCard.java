package cards;

public class HeartPlayingCard extends AbstractPlayingCard {

    public HeartPlayingCard(int faceValue) {
        super(faceValue);
    }

    @Override
    Suit getSuit() {
        return Suit.HEARTS;
    }
}
