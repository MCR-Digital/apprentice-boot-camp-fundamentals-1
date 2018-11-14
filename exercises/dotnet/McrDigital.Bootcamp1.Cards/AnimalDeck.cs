namespace McrDigital.Bootcamp1.Cards {
  using System;
  using System.Collections.Generic;

  public class AnimalDeck {
    private readonly List<AnimalCard> _cards;

    public AnimalDeck() {
      this._cards = new List<AnimalCard>();
      foreach (Animal animal in Enum.GetValues(typeof(Animal))) {
        this._cards.Add(new AnimalCard(animal));
        this._cards.Add(new AnimalCard(animal));
      }
    }

    public AnimalCard Deal() {
      var card = this._cards[0];
      this._cards.RemoveAt(0);
      return card;
    }

    public string[] GetCards() {
      var result = new String[this._cards.Count];
      for (var index = 0; index < this._cards.Count; index++) {
        var card = this._cards[index]; result[index] = card.ToString();
      }
      return result;
    }

    public void Shuffle() {
      this._cards.KnuthShuffle();
    }
  }

  public static class ListExtensions {
    public static void KnuthShuffle<T>(this List<T> @this) {
      // Use the Knuth Shuffle (aka Fisher-Yates shuffle) to shuffle the list of cards.
      // https://en.wikipedia.org/wiki/Fisher–Yates_shuffle
      // https://stackoverflow.com/a/25943363
      var random = new Random();
      for (var index = (@this.Count - 1); index > 0; index--) {
        var next = random.Next(index + 1);
        var temp = @this[index];
        @this[index] = @this[next];
        @this[next] = temp;
      }
    }
  }
}