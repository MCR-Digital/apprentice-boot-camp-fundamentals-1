class AnimalCard {
  constructor(animal) {
    this.animal = animal;
  }

  //checks if cards are a match and returns true or false 
  snap(otherCard) {
    return (otherCard) && this.animal === otherCard.animal;
  }

  //same as getFormattedCard()
  toString() {
    return this.animal.toString();
  }
};


module.exports = {
  AnimalCard: AnimalCard
};



//this class used to create a card