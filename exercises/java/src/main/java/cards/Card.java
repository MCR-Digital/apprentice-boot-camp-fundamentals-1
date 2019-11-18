package cards;

public class Card {

    private int cardNumber;
    private String faceValueName;
    private Suit suit;

    public Card(int cardNumber, String faceValueName, Suit suit) {
        this.cardNumber = cardNumber;
        this.faceValueName = faceValueName;
        this.suit = suit;
    }

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
}
