namespace McrDigital.Bootcamp1.Cards
{
    public class AnimalCard
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

        public bool Snap(AnimalCard other)
        {
            return _animal == other._animal;
        }

        public override string ToString()
        {
            return _animal.ToString();
        }
    }
}