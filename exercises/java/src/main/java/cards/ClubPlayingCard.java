package cards;

public abstract class ClubPlayingCard extends AbstractPlayingCard {

    @Override
    final Suit getSuit() {
        return Suit.CLUBS;
    }
}
