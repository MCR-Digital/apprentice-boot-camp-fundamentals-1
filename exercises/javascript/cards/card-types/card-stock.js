class CardStock {
    constructor(faceValue) {
        this.faceValue = faceValue;
    }

    snap(otherCard) {
        return otherCard && this.faceValue === otherCard.faceValue;
    }
}

module.exports = {
    CardStock
};