package cards;

public class Suit {
    public enum SUITS {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }

    SUITS suit;

    public Suit(SUITS suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.suit.toString().toLowerCase();
    }
}
