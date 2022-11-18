import { AnimalDeck } from "./animal-deck"

describe('AnimalDeck', function () {
  test('get deck in order, return 52 cards correctly formatted', () => {
    const animalDeck = new AnimalDeck()
    expect(animalDeck.getCards()).toStrictEqual(testArray)
  })

  test('shuffle returns all cards in any order', () => {
    const animalDeck = new AnimalDeck()
    animalDeck.shuffle()

    const result = animalDeck.getCards()

    expect(result).toHaveLength(testArray.length)
    expect(result).toEqual(expect.arrayContaining(testArray))
  })

  const testArray = [
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
  ]
})