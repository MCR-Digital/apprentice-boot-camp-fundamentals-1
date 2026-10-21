package cat;

public class Main {
    static void main() {
        Cat blackCat = new Cat();
        Cat orangeCat = new Cat();

        Mat purpleMat = new Mat();
        purpleMat.length = 100.0;
        purpleMat.width = 50.0;
        purpleMat.colour = "Purple";

        blackCat.sit();
        blackCat.sit(purpleMat);
    }
}