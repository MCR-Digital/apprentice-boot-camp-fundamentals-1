const { CardStock } = require('./card-stock');

class AnimalCard extends CardStock {
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