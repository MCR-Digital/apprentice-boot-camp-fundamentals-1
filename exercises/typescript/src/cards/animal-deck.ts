import { Animal as animals } from "./animal"
import { AnimalCard } from "./animal-card"

export class AnimalDeck {
  private readonly cards: AnimalCard[]

  constructor() {
    this.cards = []

    for (const animal in animals) {
      this.cards.push(new AnimalCard(animal))
      this.cards.push(new AnimalCard(animal))
    }
  }

  getCards(): string[] {
    const result: string[] = []

    for (let i = 0; i < this.cards.length; i++) {
      const card: AnimalCard = this.cards[i]
      result.push(card.toString())
    }

    return result
  }

  shuffle() {
    for (let i = 0; i < this.cards.length; i++) {
      const indexA = Math.floor(Math.random() * i)
      const indexB = i

      const valueA = this.cards[indexA]
      const valueB = this.cards[indexB]

      this.cards[indexA] = valueB
      this.cards[indexB] = valueA
    }
  }

  deal(): AnimalCard {
    return this.cards.splice(0, 1)[0]
  }
}
