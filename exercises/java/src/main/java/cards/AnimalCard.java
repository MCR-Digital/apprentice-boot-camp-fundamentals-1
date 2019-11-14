package cards;

public class AnimalCard implements Card {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean snap(Card otherCard){
        return otherCard != null && this.animal.equals(((AnimalCard)otherCard).animal);
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
