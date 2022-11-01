namespace McrDigital.Bootcamp1.Cards
{
    using System;

    public class PlayingCardDeck
    {
        private PlayingCard[] _cards;

        public PlayingCardDeck()
        {
            _cards = new PlayingCard[52];
            foreach (Suit suit in Enum.GetValues(typeof(Suit)))
            {
                for (var faceValue = 0; faceValue < 13; faceValue++)
                {
                    _cards[(int)suit * 13 + faceValue] = new PlayingCard(suit, faceValue);
                }
            }
        }

        public string[] GetCards()
        {
            var result = new String[_cards.Length];


            var cardNumber = 0;
            foreach (var card in _cards)
            {
                result[cardNumber] = card.ToString();
                cardNumber++;
            }

            return result;
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