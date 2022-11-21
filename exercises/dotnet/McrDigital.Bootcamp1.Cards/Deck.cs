using System;
using System.Collections.Generic;

namespace McrDigital.Bootcamp1.Cards
{
    public abstract class Deck
    {
        protected List<Card> _cards;

        protected Deck()
        {
            _cards = new List<Card>();
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

        public Card Deal()
        {
            var card = _cards[0];
            _cards.RemoveAt(0);
            return card;
        }

        public void Shuffle()
        {
            _cards.KnuthShuffle();
        }
    }
}