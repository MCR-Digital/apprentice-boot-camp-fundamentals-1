// to execute the runnable code in this file, use the command
// `node cards/cards.js` from the command line positioned at
// the project's root directory.
const Card = require('./card.js').Card;

const suits = ["clubs", "diamonds", "hearts", "spades"];

class Cards {
  constructor() {
    this.cards = this.setCards();
  }

  setCards() {
    var cards = [];

    for (var i = 0; i < suits.length; i++) {
      for (var j = 1; j < 14; j++) {
        var card = new Card(suits[i], j);
        cards.push(card);
      }
    }

    return cards;
  }

  getCards() {
    var result = [];

    for (var i = 0; i < this.cards.length; i++) {
      var faceValueName = ""
      switch (this.cards[i].faceValue) {
        case 1:
          faceValueName = "ace";
          break;

        case 11:
          faceValueName = "jack";
          break;
        
        case 12:
          faceValueName = "queen";
          break;

        case 13:
          faceValueName = "king";
          break;

        default:
          faceValueName = this.cards[i].faceValue;
          break;
      }

      result.push(faceValueName + " of " + this.cards[i].suit);
    }

    return result;
  }
};

module.exports = {
  Cards
};