namespace McrDigital.Bootcamp1.Cards {
  public class AnimalCard {
    private readonly Animal _animal;

    public AnimalCard(Animal animal) {
      this._animal = animal;
    }

    public Animal Animal {
      get => this._animal;
    }

    public bool Snap(AnimalCard other) {
      return this._animal == other._animal;
    }

    public override string ToString() {
      return this._animal.ToString();
    }
  }
}