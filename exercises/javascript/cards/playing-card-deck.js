const { PlayingCard } = require('./playing-card.js');
const { DeckOfCards } = require('./deck-of-cards.js');

const suits = ["clubs", "diamonds", "hearts", "spades"];

class PlayingCardDeck extends DeckOfCards {
  constructor() {
    super();
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
};

module.exports = {
  PlayingCardDeck
};