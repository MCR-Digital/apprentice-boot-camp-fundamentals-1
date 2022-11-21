namespace McrDigital.Bootcamp1.Cards
{
    using System;

    public class PlayingCardDeck : Deck
    {
        public PlayingCardDeck()
        {
            foreach (var suit in Enum.GetValues<Suit>())
            {
                for (var faceValue = 0; faceValue < 13; faceValue++)
                {
                    _cards.Add(new PlayingCard(suit, faceValue));
                }
            }
        }
    }
}