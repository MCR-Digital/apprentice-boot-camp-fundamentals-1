const animals = require('./animal.js').Animal;
const { AnimalCard } = require('./animal-card.js');

//this class used to populate the deck with cards, and perform various methods on the deck(array of cards) 

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
    let indexA = Math.floor(Math.random() * i); //10
    let indexB = i; //50

    let valueA = this.cards[indexA]; // card 10
    let valueB = this.cards[indexB]; //card 50

    this.cards[indexA] = valueB;  //give card 10  - this is element 10 in the array - the value of 50 e.g.lion
    this.cards[indexB] = valueA; //give card 50 - this is element 50 in the array - the value of 10 e.g. tiger
  }
};

AnimalDeck.prototype.deal = function () {
  let card = this.cards.splice(0, 1)[0]; 
  return card; //returns an array of one element - the card dealt from the cards array
};


module.exports = {
  AnimalDeck: AnimalDeck
};