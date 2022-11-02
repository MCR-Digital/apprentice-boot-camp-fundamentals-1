package cards;

public class AnimalCard {

    private final Animal animal;

    public AnimalCard(Animal animal) {
        this.animal = animal;
    }

    public boolean snap( AnimalCard otherCard ){
        return otherCard != null && this.animal.equals(otherCard.animal);
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
