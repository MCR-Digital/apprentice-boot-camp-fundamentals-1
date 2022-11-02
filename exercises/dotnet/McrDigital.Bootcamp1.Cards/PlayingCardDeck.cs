namespace McrDigital.Bootcamp1.Cards
{
    using System;
    using System.Collections.Generic;

    public class PlayingCardDeck : Deck
    {
        public PlayingCardDeck()
        {
            _cards = new List<Card>();
            foreach (Suit suit in Enum.GetValues(typeof(Suit)))
            {
                for (var faceValue = 0; faceValue < 13; faceValue++)
                {
                    _cards.Add(new PlayingCard(suit, faceValue));
                }
            }
        }

        static void Main(string[] args)
        {
            var playingCardDeck = new PlayingCardDeck();
            var deckInOrder = playingCardDeck.GetCards();
            foreach (var card in deckInOrder)
            {
                Console.WriteLine(card);
            }
        }
    }
}