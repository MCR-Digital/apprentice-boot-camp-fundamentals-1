using System;

namespace McrDigital.Bootcamp1.Cards
{
    public class PlayingCard
    {
        public readonly int FaceValue;
        public readonly Suit Suit;

        public PlayingCard(Suit suit, int faceValue)
        {
            Suit = suit;
            FaceValue = faceValue;
        }

        public override string ToString()
        {
            var faceValueName = string.Empty;
            switch (FaceValue)
            {
                case 0:
                    faceValueName = "ace";
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    faceValueName = (FaceValue + 1).ToString();
                    break;
                case 10:
                    faceValueName = "jack";
                    break;
                case 11:
                    faceValueName = "queen";
                    break;
                case 12:
                    faceValueName = "king";
                    break;
                default: throw new ArgumentException($"Something went wrong {FaceValue} is not a valid faceValue!");
            }

            return $"{faceValueName} of {Suit}";
        }
    }
}