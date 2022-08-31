package cards;

public abstract class AbstractPlayingCard extends Card {
    private final int faceValue;

    abstract Suit getSuit();

    public int getFaceValue() {
        return faceValue;
    }

    protected AbstractPlayingCard(int faceValue) {
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

        return faceValueName + " of " + getSuit();
    }

    @Override
    public boolean snap(Card otherCard) {
        return getFaceValue() == ((AbstractPlayingCard)otherCard).getFaceValue();
    }
}