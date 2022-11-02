namespace McrDigital.Bootcamp1.Cards
{
    using System;
    using System.Collections.Generic;

    public class AnimalDeck : Deck
    {
        public AnimalDeck()
        {
            _cards = new List<Card>();
            foreach (Animal animal in Enum.GetValues(typeof(Animal)))
            {
                _cards.Add(new AnimalCard(animal));
                _cards.Add(new AnimalCard(animal));
            }
        }
    }
}