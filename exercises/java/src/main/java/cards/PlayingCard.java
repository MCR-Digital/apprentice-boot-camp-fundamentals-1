package cards;

public class PlayingCard extends Card{

    // Variables
    private int cardNumber;
    private String faceValueName;
    private Suit suit;

    // Constructor
    public PlayingCard(int cardNumber, String faceValueName, Suit suit) {
        this.cardNumber = cardNumber;
        this.faceValueName = faceValueName;
        this.suit = suit;
    }

    // Getters and setters
    public int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFaceValueName() {
        return faceValueName;
    }
    public void setFaceValueName(String faceValueName) {
        this.faceValueName = faceValueName;
    }

    public Suit getSuit() {
        return suit;
    }
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    // Snap method
    @Override
    public boolean snap(Card otherCard) {
        return otherCard != null && this.faceValueName.equals(((PlayingCard)otherCard).faceValueName);
    }

    @Override
    public String toString() {
        return "PlayingCard{" +
                "cardNumber=" + cardNumber +
                ", faceValueName='" + faceValueName + '\'' +
                ", suit=" + suit +
                '}';
    }
}
