package cards;

public abstract class HeartPlayingCard extends AbstractPlayingCard {

    @Override
    final Suit getSuit() {
        return Suit.HEARTS;
    }
}
