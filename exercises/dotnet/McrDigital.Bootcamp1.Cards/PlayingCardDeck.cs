using System;
using System.Collections.Generic;
using System.Text;

namespace McrDigital.Bootcamp1.Cards
{
    public class PlayingCardDeck: Deck
    {
        private List<PlayingCard> Deck;

        public PlayingCardDeck()
        {
            Deck = new List<PlayingCard>();

            for (var suit = 0; suit < 4; suit++)
            {
                for (var faceValue = 0; faceValue < 13; faceValue++)
                {
                    var card = new PlayingCard(suit, faceValue);
                    Deck.Add(card);
                }
            }
        }

        public string[] GetCards()
        {
            var cards = new string[Deck.Count];

            for(int i = 0; i < Deck.Count; i++)
            {
                cards[i] = Deck[i].ToString();
            }

            return cards;
        }

        public Card Deal()
        {
            var card = Deck[0];
            Deck.RemoveAt(0);
            return (Card)card;
        }

        public void Shuffle()
        {
            Deck.KnuthShuffle();
        }
    }
}
