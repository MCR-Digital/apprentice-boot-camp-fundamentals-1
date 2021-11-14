package cards;

public class ClubPlayingCard extends AbstractPlayingCard {

    public ClubPlayingCard(int faceValue) {
        super(faceValue);
    }

    @Override
    Suit getSuit() {
        return Suit.CLUBS;
    }
}
