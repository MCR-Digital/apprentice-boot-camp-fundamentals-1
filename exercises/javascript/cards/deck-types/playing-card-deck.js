const { PlayingCard } = require('../card-types/playing-card.js');
const { CardStockDeck } = require('./card-stock-deck');
const { Suits } = require('../card-types/suits.js');

class PlayingCardDeck extends CardStockDeck {
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
}

module.exports = {
  PlayingCardDeck
};