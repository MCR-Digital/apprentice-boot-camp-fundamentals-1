package cards;

public class PlayingCard {
    private final int suit;
    private final int faceValue;

    public int getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public PlayingCard(int suit, int faceValue) {

        this.suit = suit;
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        String faceValueName;
        switch (getFaceValue()){
            case 0: faceValueName = "ace"; break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: faceValueName = Integer.toString(getFaceValue()+1); break;
            case 10: faceValueName = "jack"; break;
            case 11: faceValueName = "queen"; break;
            case 12: faceValueName = "king"; break;
            default: throw new IllegalArgumentException("Something went wrong " + getFaceValue() + "is not a valid faceValue!");
        }

        String suitName;
        switch (getSuit()){
            case 0: suitName = "clubs"; break;
            case 1: suitName = "diamonds"; break;
            case 2: suitName = "hearts"; break;
            case 3: suitName = "spades"; break;
            default: throw new IllegalArgumentException("Something went wrong " + getSuit() + "is not a valid suitName!");
        }

        return faceValueName + " of " + suitName;
    }
}
