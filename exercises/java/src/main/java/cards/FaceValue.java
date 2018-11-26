package cards;

public enum FaceValue {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    @Override
    public String toString() {
        String faceValueName = "";
        switch (this){
            //N.B. the absence of break statements and the dependence upon order of case statements is BAD form.
            case TWO:
            case THREE:
            case FOUR:
            case FIVE:
            case SIX:
            case SEVEN:
            case EIGHT:
            case NINE:
            case TEN: faceValueName = Integer.toString(ordinal() + 1 ); break;
            case JACK:
            case QUEEN:
            case KING:
            case ACE: faceValueName = name().toLowerCase(); break;
        }
        return faceValueName;
    }
}
