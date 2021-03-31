class AnimalCard {
  constructor(animal) {
    this.animal = animal;
  }

  snap(otherCard) {
    return otherCard && this.animal === otherCard.animal;
  }

  toString() {
    return this.animal.toString();
  }
};

module.exports = {
  AnimalCard
};