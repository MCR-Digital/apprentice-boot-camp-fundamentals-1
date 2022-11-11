export class AnimalCard {
  private animal: string

  constructor(animal: string) {
    this.animal = animal
  }

  snap(otherCard: AnimalCard) {
    return otherCard && this.animal === otherCard.animal
  }

  toString() {
    return this.animal.toString()
  }
}