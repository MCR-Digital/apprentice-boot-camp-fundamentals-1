package cards

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class AnimalDeckTest {

    @Test
    fun getDeckInOrder_return52CardsCorrectlyFormatted() {
        val animalDeck = AnimalDeck()
        val formattedList = listOf(
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
        )
        assertEquals(formattedList, animalDeck.getCards())
    }

    @Test
    fun shuffle_returnsAllCardsInAnyOrder() {
        val deck = AnimalDeck()
        deck.shuffle()
        val formattedList = listOf(
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
        )
        assertTrue(
            deck.getCards().containsAll(
                formattedList
            )
        )
        assertNotEquals(deck.getCards(), formattedList)
    }
}