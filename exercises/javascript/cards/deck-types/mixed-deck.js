const { CardStockDeck } = require('./card-stock-deck.js');

class MixedDeck extends CardStockDeck {
    constructor(cards) {
        super();
        this.cards = cards;
    }
}

module.exports = {
    MixedDeck
}