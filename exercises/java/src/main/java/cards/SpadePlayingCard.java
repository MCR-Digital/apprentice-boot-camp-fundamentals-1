package cards;

public abstract class SpadePlayingCard extends AbstractPlayingCard {

    @Override
    final Suit getSuit() {
        return Suit.SPADES;
    }
}
