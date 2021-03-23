using System;
using System.Collections.Generic;
using System.Text;

namespace McrDigital.Bootcamp1.Cards
{
    class PlayingCardDeck
    {
        private PlayingCard[] Deck;

        public PlayingCardDeck()
        {
            Deck = new PlayingCard[52];

            for (var suit = 0; suit < 4; suit++)
            {
                for (var faceValue = 0; faceValue < 13; faceValue++)
                {
                    var card = new PlayingCard(suit, faceValue);
                    Deck[suit * 13 + faceValue] = card;
                }
            }
        }

        public string[] GetCards()
        {
            var cards = new string[52];

            for(int i = 0; i < cards.Length; i++)
            {
                cards[i] = Deck[i].ToString();
            }

            return cards;
        }
    }
}
