package cards;

public class AnimalCard {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    boolean snap( AnimalCard otherCard ){
        return otherCard != null && this.animal.equals(otherCard.animal);
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
