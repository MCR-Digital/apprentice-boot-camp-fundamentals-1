namespace McrDigital.Bootcamp1.Cards
{
    using System;
    using System.Collections.Generic;

    public class PlayingCardDeck : IDeck
    {
        private readonly List<PlayingCard> _cards;

        public PlayingCardDeck()
        {
            _cards = new List<PlayingCard>();
            foreach (Suit suit in Enum.GetValues(typeof(Suit)))
            {
                for (var faceValue = 0; faceValue < 13; faceValue++)
                {
                    _cards.Add(new PlayingCard(suit, faceValue));
                }
            }
        }

        public string[] GetCards()
        {
            var result = new String[_cards.Count];


            var cardNumber = 0;
            foreach (var card in _cards)
            {
                result[cardNumber] = card.ToString();
                cardNumber++;
            }

            return result;
        }

        public ICard Deal()
        {
            var card = _cards[0];
            _cards.RemoveAt(0);
            return card;
        }

        public void Shuffle()
        {
            _cards.KnuthShuffle();
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