const animals = require('../card-types/animal.js').Animal;
const { AnimalCard } = require('../card-types/animal-card.js');
const { CardStockDeck } = require('./card-stock-deck.js');

class AnimalDeck extends CardStockDeck {
  constructor() {
    super();
    this.cards = this.setCards();  
  }

  setCards() {
    var cards = [];

    for (const animal in animals) {
      cards.push(new AnimalCard(animal));
      cards.push(new AnimalCard(animal));
    }

    return cards;
  }
};

module.exports = {
  AnimalDeck
};