class PlayingCard {
    constructor(suit, faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    snap(otherCard) {
        return otherCard && this.faceValue === otherCard.faceValue;
    }
}

module.exports = {
    PlayingCard
};