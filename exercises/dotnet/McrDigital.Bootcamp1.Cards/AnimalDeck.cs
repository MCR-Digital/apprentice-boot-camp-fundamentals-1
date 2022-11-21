namespace McrDigital.Bootcamp1.Cards
{
    using System;

    public class AnimalDeck : Deck
    {
        public AnimalDeck()
        {
            foreach (Animal animal in Enum.GetValues<Animal>())
            {
                _cards.Add(new AnimalCard(animal));
                _cards.Add(new AnimalCard(animal));
            }
        }
    }
}