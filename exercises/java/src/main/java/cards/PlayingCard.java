package cards;

public class PlayingCard {
    int faceValue;
    Suit suit;

    public PlayingCard(int faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    private String getFaceValue() {
        return switch (faceValue) {
            case 0 -> "ace";
            case 10 -> "jack";
            case 11 -> "queen";
            case 12 -> "king";
            default -> String.valueOf(faceValue + 1);
        };
    }

    @Override
    public String toString() {
        return "%s of %s".formatted(getFaceValue(), this.suit);
    }
}
