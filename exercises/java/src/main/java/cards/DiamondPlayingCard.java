package cards;

public class DiamondPlayingCard extends AbstractPlayingCard {

    public DiamondPlayingCard(int faceValue) {
        super(faceValue);
    }

    @Override
    Suit getSuit() {
        return Suit.DIAMONDS;
    }
}
