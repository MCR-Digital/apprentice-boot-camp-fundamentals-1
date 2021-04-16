using System;
using System.Collections.Generic;
using System.Text;

namespace McrDigital.Bootcamp1.Cards
{
    public abstract class Card
    {
        protected abstract string Value { get; }
        public bool Snap(Card previous, Card next)
        {
            return previous.Value.ToString().Equals(next.Value);
        }
    }
}
