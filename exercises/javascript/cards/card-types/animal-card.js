const { CardStock } = require('./card-stock');

class AnimalCard extends CardStock {
  constructor(faceValue) {
    super(faceValue);
  }
};

module.exports = {
  AnimalCard
};