class CardStock {
    constructor(faceValue) {
        this.faceValue = faceValue;
    }

    snap(otherCard) {
        return otherCard && this.faceValue === otherCard.faceValue;
    }

    toString() {
        return this.faceValue.toString();
    }
}

module.exports = {
    CardStock
};