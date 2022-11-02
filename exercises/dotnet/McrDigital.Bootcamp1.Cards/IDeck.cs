namespace McrDigital.Bootcamp1.Cards
{
    public interface IDeck
    {
        string[] GetCards();
        public ICard Deal();
        void Shuffle();
    }
}