namespace McrDigital.Bootcamp1.Cards
{
    public class AnimalCard: Card
    {
        private readonly Animal _animal;
        protected override string Value { get { return _animal.ToString(); } }

        public AnimalCard(Animal animal)
        {
            _animal = animal;
        }

        private Animal Animal
        {
            get => _animal;
        }

        public override string ToString()
        {
            return _animal.ToString();
        }
    }
}