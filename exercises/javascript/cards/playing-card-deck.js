// to execute the runnable code in this file, use the command
// `node cards/cards.js` from the command line positioned at
// the project's root directory.
const PlayingCard = require('./playing-card.js').PlayingCard;

const suits = ["clubs", "diamonds", "hearts", "spades"];

class PlayingCardDeck {
  constructor() {
    this.cards = this.setCards();
  }

  setCards() {
    var cards = [];

    for (var i = 0; i < suits.length; i++) {
      for (var j = 1; j < 14; j++) {
        var card = new PlayingCard(suits[i], j);
        cards.push(card);
      }
    }

    return cards;
  }

  getCards() {
    var result = [];
    for (var i = 0; i < this.cards.length; i++) {
      const card = this.cards[i];
      result.push(card.toString());
    }
    return result;
  }
};

const cards = new PlayingCardDeck();
const deckInOrder = cards.getCards();
for (const card of deckInOrder) {
  console.log(card);
}

module.exports = {
  PlayingCardDeck
};