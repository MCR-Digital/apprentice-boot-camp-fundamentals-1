package cards;

public class AnimalCard implements Card {
    private final Animal animal;

    public AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean snap(Card otherCard){
        return otherCard != null && this.animal.toString().equals(otherCard.toString());
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}