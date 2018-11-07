enum Animal {
    AARDVARK,
    BABOON,
    CAMEL,
    DEER,
    ELEPHANT,
    FROG,
    GORILLA,
    HARE,
    IMPALA,
    JAGUAR,
    KANGAROO,
    LION,
    MOOSE,
    NEWT,
    OCTOPUS,
    PENGUIN,
    QUETZAL,
    RABBIT,
    SALMON,
    TORTOISE,
    UAKARIS,
    VAQUITA,
    WHALE,
    X_RAY_TETRA,
    YAK,
    ZEBRA
}

public class Abstraction {

    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        String[] deckInOrder = abstraction.getDeckInOrder();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getDeckInOrder() {
        Animal[] animals = Animal.values();
        String[] result = new String[52];
        for (int i = 0; i < animals.length; i++) {
            String animalName = animals[i].name().toLowerCase();
            result[i*2] = animalName;
            result[i*2+1] = animalName;
        }
        return result;
    }

}
