package cards;

public class Suit {
    String suit;

    Suit(String theSuit) {
        this.suit = theSuit;
    }

    @Override
    public String toString() {
        return this.suit;
    }
}