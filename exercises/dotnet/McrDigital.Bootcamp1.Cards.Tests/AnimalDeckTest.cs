using FluentAssertions;

namespace McrDigital.Bootcamp1.Cards.Tests
{
    using Xunit;
    using McrDigital.Bootcamp1.Cards;

    public class AnimalDeckTest
    {
        [Fact]
        public void ShouldGetDeckInOrderAndReturn52CardsCorrectlyFormatted()
        {
            var deck = new AnimalDeck();
            var expectedCards = new string[]
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
            };

            var actualCards = deck.GetCards();
            actualCards.Should().BeEquivalentTo(expectedCards, options => options.WithStrictOrdering());
        }

        [Fact]
        public void ShouldShuffleAndReturnCardsInAnyOrder()
        {
            var deck = new AnimalDeck();
            deck.Shuffle();

            var fullCardSetInAlphabeticalOrder = new string[]
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
            };
            var actualCards = deck.GetCards();

            actualCards.Should().BeEquivalentTo(fullCardSetInAlphabeticalOrder).And.NotContainInOrder(fullCardSetInAlphabeticalOrder);
        }
    }
}