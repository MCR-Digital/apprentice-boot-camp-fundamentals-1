const { CardInDeck } = require('./card-in-deck.js');

class PlayingCard extends CardInDeck {
    constructor(suit, faceValue) {
        super(faceValue);
        this.suit = suit;

        switch(this.faceValue) {
            case 1:
                this.faceValue = "ace";
                break;

            case 11:
                this.faceValue = "jack";
                break;
                
            case 12:
                this.faceValue = "queen";
                break;
    
            case 13:
                this.faceValue = "king";
                break;
        }
    }
}

module.exports = {
    PlayingCard
};