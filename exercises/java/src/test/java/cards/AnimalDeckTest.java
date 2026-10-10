package cards;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalDeckTest {
    String[] expectedAnimalArray = new String[]{
            "AARDVARK",
            "AARDVARK",
            "BABOON",
            "BABOON",
            "CAMEL",
            "CAMEL",
            "DEER",
            "DEER",
            "ELEPHANT",
            "ELEPHANT",
            "FROG",
            "FROG",
            "GORILLA",
            "GORILLA",
            "HARE",
            "HARE",
            "IMPALA",
            "IMPALA",
            "JAGUAR",
            "JAGUAR",
            "KANGAROO",
            "KANGAROO",
            "LION",
            "LION",
            "MOOSE",
            "MOOSE",
            "NEWT",
            "NEWT",
            "OCTOPUS",
            "OCTOPUS",
            "PENGUIN",
            "PENGUIN",
            "QUETZAL",
            "QUETZAL",
            "RABBIT",
            "RABBIT",
            "SALMON",
            "SALMON",
            "TORTOISE",
            "TORTOISE",
            "UAKARIS",
            "UAKARIS",
            "VAQUITA",
            "VAQUITA",
            "WHALE",
            "WHALE",
            "X_RAY_TETRA",
            "X_RAY_TETRA",
            "YAK",
            "YAK",
            "ZEBRA",
            "ZEBRA"
    };

    @Test
    public void getDeckInOrder_return52CardsCorrectlyFormatted() {
        AnimalDeck animalDeck = new AnimalDeck();
        assertArrayEquals(this.expectedAnimalArray, animalDeck.getCards());
    }

    @Test
    public void shuffle_returnsAllCardsInAnyOrder() {
        AnimalDeck deck = new AnimalDeck();
        deck.shuffle();
        // Convert each deck to Lists to enable use of methods
        List<String> result = List.of(deck.getCards());
        List<String> expected = List.of(this.expectedAnimalArray);

        // Passes if both arrays are equal in size and contain the same elements
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

}