package cards;

public class FaceValue {
    private final String pictureValue;

    public FaceValue(String pictureValue) {
        this.pictureValue = pictureValue;
    }

    @Override
    public String toString() {
        return this.pictureValue;
    }
}
