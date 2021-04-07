using System;
using System.Collections.Generic;
using System.Text;

namespace McrDigital.Bootcamp1.Cards
{
    class SuperDeck : Deck
    {
        public SuperDeck()
        {
            CardDeck = new List<Card>();

            for (var suit = 0; suit < 4; suit++)
            {
                for (var faceValue = 0; faceValue < 13; faceValue++)
                {
                    var card = new PlayingCard(suit, faceValue);
                    CardDeck.Add(card);
                }
            }

            foreach (Animal animal in Enum.GetValues(typeof(Animal)))
            {
                var card = new AnimalCard(animal);

                CardDeck.Add(card);
                CardDeck.Add(card);
            }
        }
    }
}
