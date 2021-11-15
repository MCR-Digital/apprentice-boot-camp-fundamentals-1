const animals = require('../animal.js').Animal;
const { AnimalCard } = require('../animal-card.js');
const { DeckOfCards } = require('./deck-of-cards.js');

class AnimalDeck extends DeckOfCards {
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