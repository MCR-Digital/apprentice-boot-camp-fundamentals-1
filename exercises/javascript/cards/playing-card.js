class PlayingCard extends CardInDeck {
    constructor(suit, faceValue) {
        this.suit = suit;
        super(faceValue);
    }
}

module.exports = {
    PlayingCard
};