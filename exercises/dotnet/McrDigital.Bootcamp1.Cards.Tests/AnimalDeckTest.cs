namespace McrDigital.Bootcamp1.Cards.Tests
{
    using System.Linq;
    using Xunit;
    using McrDigital.Bootcamp1.Cards;

    public class AnimalDeckTest
    {
        [Fact]
        public void ShouldGetDeckInOrderAndReturn52CardsCorrectlyFormatted()
        {
            var deck = new AnimalDeck();
            Assert.Equal(
                new string[]
                {
                    "Aardvark",
                    "Aardvark",
                    "Baboon",
                    "Baboon",
                    "Camel",
                    "Camel",
                    "Deer",
                    "Deer",
                    "Elephant",
                    "Elephant",
                    "Frog",
                    "Frog",
                    "Gorilla",
                    "Gorilla",
                    "Hare",
                    "Hare",
                    "Impala",
                    "Impala",
                    "Jaguar",
                    "Jaguar",
                    "Kangaroo",
                    "Kangaroo",
                    "Lion",
                    "Lion",
                    "Moose",
                    "Moose",
                    "Newt",
                    "Newt",
                    "Octopus",
                    "Octopus",
                    "Penguin",
                    "Penguin",
                    "Quetzal",
                    "Quetzal",
                    "Rabbit",
                    "Rabbit",
                    "Salmon",
                    "Salmon",
                    "Tortoise",
                    "Tortoise",
                    "Uakaris",
                    "Uakaris",
                    "Vaquita",
                    "Vaquita",
                    "Whale",
                    "Whale",
                    "XRayTetra",
                    "XRayTetra",
                    "Yak",
                    "Yak",
                    "Zebra",
                    "Zebra"
                },
                deck.GetCards());
        }

        [Fact]
        public void ShouldShuffleAndReturnCardsInAnyOrder()
        {
            var deck = new AnimalDeck();
            deck.Shuffle();
            Assert.Equal(
                new string[]
                {
                    "Aardvark",
                    "Aardvark",
                    "Baboon",
                    "Baboon",
                    "Camel",
                    "Camel",
                    "Deer",
                    "Deer",
                    "Elephant",
                    "Elephant",
                    "Frog",
                    "Frog",
                    "Gorilla",
                    "Gorilla",
                    "Hare",
                    "Hare",
                    "Impala",
                    "Impala",
                    "Jaguar",
                    "Jaguar",
                    "Kangaroo",
                    "Kangaroo",
                    "Lion",
                    "Lion",
                    "Moose",
                    "Moose",
                    "Newt",
                    "Newt",
                    "Octopus",
                    "Octopus",
                    "Penguin",
                    "Penguin",
                    "Quetzal",
                    "Quetzal",
                    "Rabbit",
                    "Rabbit",
                    "Salmon",
                    "Salmon",
                    "Tortoise",
                    "Tortoise",
                    "Uakaris",
                    "Uakaris",
                    "Vaquita",
                    "Vaquita",
                    "Whale",
                    "Whale",
                    "XRayTetra",
                    "XRayTetra",
                    "Yak",
                    "Yak",
                    "Zebra",
                    "Zebra"
                },
                deck.GetCards().OrderBy((animal) => animal));
        }
    }
}