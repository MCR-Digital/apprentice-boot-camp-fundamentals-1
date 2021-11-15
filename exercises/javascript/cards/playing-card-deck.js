const { PlayingCard } = require('./playing-card.js');
const { DeckOfCards } = require('./deck-of-cards.js');
const { Suits } = require('./suits.js');

class PlayingCardDeck extends DeckOfCards {
  constructor() {
    super();
    this.cards = this.setCards();
  }

  setCards() {
    var cards = [];

    for (var i = 0; i < Suits.length; i++) {
      for (var j = 1; j < 14; j++) {
        var card = new PlayingCard(Suits[i], j);
        cards.push(card);
      }
    }

    return cards;
  }
};

module.exports = {
  PlayingCardDeck
};