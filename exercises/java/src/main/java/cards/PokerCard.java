package cards;

class PokerCard implements Card {
    private final Suit suit;
    private final String faceValue;

    PokerCard(Suit suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }

    @Override
    public boolean snap(Card otherCard) {
        if(otherCard instanceof PokerCard){
            PokerCard pokerCard = (PokerCard) otherCard;
            return faceValue.equals(pokerCard.faceValue);
        }
        return false;
    }
}
