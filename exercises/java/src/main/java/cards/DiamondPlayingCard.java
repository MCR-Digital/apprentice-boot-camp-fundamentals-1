package cards;

public abstract class DiamondPlayingCard extends AbstractPlayingCard {

    @Override
    final Suit getSuit() {
        return Suit.DIAMONDS;
    }
}
