using System;
using System.Collections.Generic;

namespace McrDigital.Bootcamp1.Cards
{
    public static class ListExtensions
    {
        public static void KnuthShuffle<T>(this List<T> @this)
        {
            // Use the Knuth Shuffle (aka Fisher-Yates shuffle) to shuffle the list of cards.
            // https://en.wikipedia.org/wiki/Fisher–Yates_shuffle
            // https://stackoverflow.com/a/25943363
            var random = new Random();
            for (var index = (@this.Count - 1); index > 0; index--)
            {
                var next = random.Next(index + 1);
                var temp = @this[index];
                @this[index] = @this[next];
                @this[next] = temp;
            }
        }
    }
}