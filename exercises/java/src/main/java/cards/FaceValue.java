package cards;

public enum FaceValue {
    ACE("ace"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("jack"),
    QUEEN("queen"),
    KING("king");

    private String description;

    FaceValue(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
