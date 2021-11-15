const { CardInDeck } = require('./card-in-deck.js');

class PlayingCard extends CardInDeck {
    constructor(suit, faceValue) {
        super(faceValue);
        this.suit = suit;
    }
}

module.exports = {
    PlayingCard
};