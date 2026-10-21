package cat;

public class Cat {
    void sit() {
        System.out.println("I am going to sit.");
    }

    void sit(Mat mat) {
        System.out.printf("I am going to sit on the %s mat.", mat.colour);
    }
}
