const { CardInDeck } = require('./card-in-deck.js');

class AnimalCard extends CardInDeck {
  constructor(faceValue) {
    super(faceValue);
  }

  toString() {
    return this.faceValue.toString();
  }
};

module.exports = {
  AnimalCard
};