namespace McrDigital.Bootcamp1.Cards
{
    using System;
    using System.Collections.Generic;

    public class AnimalDeck: Deck
    {
        public AnimalDeck()
        {
            CardDeck = new List<Card>();
            foreach (Animal animal in Enum.GetValues(typeof(Animal)))
            {
                CardDeck.Add(new AnimalCard(animal));
                CardDeck.Add(new AnimalCard(animal));
            }
        }
    }
}