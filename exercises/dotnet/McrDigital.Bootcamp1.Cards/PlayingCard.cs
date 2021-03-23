using System;
using System.Collections.Generic;
using System.Text;

namespace McrDigital.Bootcamp1.Cards
{
    public class PlayingCard: Card
    {
        private int SuitValue { get; }
        private int CardValue { get; }

       public PlayingCard(int suitValue, int cardValue)
        {
            this.SuitValue = suitValue;
            this.CardValue = cardValue;  
        }

        override public string ToString() {

            var suitName = string.Empty;
            switch (SuitValue)
            {
                case 0:
                    suitName = "clubs";
                    break;
                case 1:
                    suitName = "diamonds";
                    break;
                case 2:
                    suitName = "hearts";
                    break;
                case 3:
                    suitName = "spades";
                    break;
                default: throw new ArgumentException($"Something went wrong {SuitValue} is not a valid suitName!");
            }

            var faceValueName = string.Empty;
            switch (CardValue)
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
                    faceValueName = (CardValue + 1).ToString();
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
                default: throw new ArgumentException($"Something went wrong {CardValue} is not a valid faceValue!");
            }

            return $"{faceValueName} of {suitName}";
        }

        public bool Snap(Card other)
        {
            return CardValue == ((PlayingCard)other).CardValue;
        }
    }
}
