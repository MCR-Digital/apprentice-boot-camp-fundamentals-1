using System;
using System.Collections.Generic;
using System.Text;

namespace McrDigital.Bootcamp1.Cards
{
    public interface Card
    {
        string Value { get; }
        bool Snap(Card other);
    }
}
