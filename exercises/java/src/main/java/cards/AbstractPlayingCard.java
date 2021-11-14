package cards;

public abstract class AbstractPlayingCard extends Card {

    abstract Suit getSuit();

    public abstract String getFaceValue();

    @Override
    public String toString() {
        return getFaceValue() + " of " + getSuit();
    }

    @Override
    public boolean snap(Card otherCard) {
        return getFaceValue().equals(((AbstractPlayingCard)otherCard).getFaceValue());
    }
}