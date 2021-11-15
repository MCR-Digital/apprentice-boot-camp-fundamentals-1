const { CardInDeck } = require('./card-in-deck.js');

class PlayingCard extends CardInDeck {
    constructor(suit, faceValue) {
        super(faceValue);
        this.suit = suit;
        this.faceValue = this.getFaceValue(faceValue);
    }

    getFaceValue(faceValue) {
        switch(faceValue) {
            case 1:
                return "ace";

            case 11:
                return "jack";
                
            case 12:
                return "queen";

            case 13:
                return "king";

            default:
                return faceValue;
        }
    }

    toString() {
        return `${this.faceValue} of ${this.suit}`;
    }
}

module.exports = {
    PlayingCard
};