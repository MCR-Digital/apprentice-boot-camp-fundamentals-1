const animals = require('../animal.js').Animal;
const { AnimalCard } = require('../card-types/animal-card.js');
const { CardStockDeck } = require('./card-stock-deck.js');

class AnimalDeck extends CardStockDeck {
  constructor() {
    super();
    this.cards = [];
    for (const animal in animals) {
      this.cards.push(new AnimalCard(animal));
      this.cards.push(new AnimalCard(animal));
    }
  }
};

module.exports = {
  AnimalDeck
};