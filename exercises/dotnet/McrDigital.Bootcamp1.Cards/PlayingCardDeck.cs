using System;
using System.Collections.Generic;
using System.Text;

namespace McrDigital.Bootcamp1.Cards
{
    public class PlayingCardDeck: Deck
    {
        public PlayingCardDeck()
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
        }
    }
}
