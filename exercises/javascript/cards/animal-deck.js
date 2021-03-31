const animals = require('./animal.js').Animal;
const { AnimalCard } = require('./animal-card.js');

class AnimalDeck {
  constructor() {
    this.cards = [];
    for (const animal in animals) {
      this.cards.push(new AnimalCard(animal));
      this.cards.push(new AnimalCard(animal));
    }
  }

  getCards() {
    const result = [];    
    for (let i = 0; i < this.cards.length; i++) {
      const card = this.cards[i];
      result.push(card.toString());
    }
    return result;
  };

  shuffle() {
    for (let i = 0; i < this.cards.length; i++) {
      const indexA = Math.floor(Math.random() * i);
      const indexB = i;
  
      const valueA = this.cards[indexA];
      const valueB = this.cards[indexB];
  
      this.cards[indexA] = valueB;
      this.cards[indexB] = valueA;
    }
  };

  deal() {
    const card = this.cards.splice(0, 1)[0];
    return card;
  };
};

module.exports = {
  AnimalDeck
};