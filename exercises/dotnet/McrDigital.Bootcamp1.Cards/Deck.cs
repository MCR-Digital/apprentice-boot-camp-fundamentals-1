using System;
using System.Collections.Generic;
using System.Text;

namespace McrDigital.Bootcamp1.Cards
{
    public interface Deck
    {
        string[] GetCards();

        Card Deal();

        void Shuffle();
    }
}
