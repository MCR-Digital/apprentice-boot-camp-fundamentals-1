package cards;

public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
