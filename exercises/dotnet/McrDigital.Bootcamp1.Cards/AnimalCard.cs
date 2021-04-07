namespace McrDigital.Bootcamp1.Cards
{
    public class AnimalCard: Card
    {
        private readonly Animal _animal;
        public string Value { get { return _animal.ToString(); } }

        public AnimalCard(Animal animal)
        {
            _animal = animal;
        }

        public Animal Animal
        {
            get => _animal;
        }

        public bool Snap(Card other)
        {
            return _animal.ToString() == other.Value;
        }

        public override string ToString()
        {
            return _animal.ToString();
        }
    }
}