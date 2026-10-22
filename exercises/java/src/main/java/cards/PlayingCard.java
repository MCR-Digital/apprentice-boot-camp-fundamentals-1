package cards;

public class PlayingCard implements Card {
    Suit suit;
    int faceValue;

    PlayingCard(int faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    @Override
    public boolean snap(Card otherCard) {
        return otherCard instanceof PlayingCard other && this.faceValue == other.faceValue;
    }

    @Override
    public String toString() {
        String face = switch (faceValue) {
            case 0 -> "ace";
            case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> Integer.toString(faceValue + 1);
            case 10 -> "jack";
            case 11 -> "queen";
            case 12 -> "king";
            default ->
                    throw new IllegalArgumentException("Something went wrong " + faceValue + " is not a valid face value");
        };
        return face + " of " + suit;
    }
}