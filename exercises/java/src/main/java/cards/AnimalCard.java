package cards;

public class AnimalCard implements Card{

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

    @Override
    public boolean snap(Card otherCard) {
        if(otherCard instanceof AnimalCard) {
            AnimalCard animalCard = (AnimalCard) otherCard;
            return animal.equals(animalCard.animal);
        }
        return false;
    }
}
