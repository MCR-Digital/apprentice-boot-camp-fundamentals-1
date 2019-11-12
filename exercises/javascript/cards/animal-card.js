let AnimalCard = class AnimalCard {
  constructor(animal) {
    this.animal = animal;
  }
};

AnimalCard.prototype.snap = function (otherCard) {
  return (otherCard) && this.animal === otherCard.animal;
};

AnimalCard.prototype.toString = function () {
  return this.animal.toString();
};

module.exports = {
  AnimalCard: AnimalCard
};