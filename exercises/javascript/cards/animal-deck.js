const animals = require('./animal.js').Animal;
const { AnimalCard } = require('./animal-card.js');

let AnimalDeck = class AnimalDeck {
  constructor() {
    this.cards = [];
    for (let animal in animals) {
      this.cards.push(new AnimalCard(animal));
      this.cards.push(new AnimalCard(animal));
    }
  }
};

AnimalDeck.prototype.getCards = function () {
  let result = new Array(this.cards.length);
  for (let i = 0; i < this.cards.length; i++) {
    let card = this.cards[i];
    result[i] = card.toString();
  }
  return result;
};

AnimalDeck.prototype.shuffle = function () {
  for (let i = 0; i < this.cards.length; i++) {
    let indexA = Math.floor(Math.random() * i);
    let indexB = i;

    let valueA = this.cards[indexA];
    let valueB = this.cards[indexB];

    this.cards[indexA] = valueB;
    this.cards[indexB] = valueA;
  }
};

AnimalDeck.prototype.deal = function () {
  let card = this.cards.splice(0, 1)[0];
  return card;
};

module.exports = {
  AnimalDeck: AnimalDeck
};