namespace McrDigital.Bootcamp1.Cards;

public class MixedDeck : Deck
{
    public MixedDeck()
    {
        var animalDeck = new AnimalDeck();
        var playingCardDeck = new PlayingCardDeck();
        for (var cardNumber = 0; cardNumber < 52; cardNumber++)
        {
            _cards.Add(animalDeck.Deal());
            _cards.Add(playingCardDeck.Deal());
        }
    }
}