namespace McrDigital.Bootcamp1.Cards
{
    public class AnimalCard : Card
    {
        private readonly Animal _animal;

        public AnimalCard(Animal animal)
        {
            _animal = animal;
        }

        public Animal Animal
        {
            get => _animal;
        }

        public override bool Snap(Card other)
        {
            return _animal == ((AnimalCard) other)._animal;
        }

        public override string ToString()
        {
            return _animal.ToString();
        }
    }
}