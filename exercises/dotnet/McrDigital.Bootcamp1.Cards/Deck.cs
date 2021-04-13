using System;
using System.Collections.Generic;
using System.Text;

namespace McrDigital.Bootcamp1.Cards
{
    public class Deck
    {
        protected List<Card> CardDeck;

        public string[] GetCards()
        {
            var cards = new string[CardDeck.Count];

            for (int i = 0; i < CardDeck.Count; i++)
            {
                cards[i] = CardDeck[i].ToString();
            }

            return cards;
        }

        public Card Deal()
        {
            var card = CardDeck[0];
            CardDeck.RemoveAt(0);
            return card;
        }

        public void Shuffle()
        {
            CardDeck.KnuthShuffle();
        }
    }
}
