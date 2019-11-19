package cards;

abstract public class Card {

    abstract boolean snap(Card otherCard);

    @Override
    public String toString() {
        return "Card{}";
    }
}
