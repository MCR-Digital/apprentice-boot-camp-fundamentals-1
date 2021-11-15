// to execute the runnable code in this file, use the command
// `node cards/playing-card-deck.js` from the command line positioned at
// the project's root directory.
const PlayingCard = require('./playing-card.js').PlayingCard;

const suits = ["clubs", "diamonds", "hearts", "spades"];

class PlayingCardDeck {
  constructor() {
    this.cards = this.setCards();
  }

  setCards() {
    var cards = [];

    for (var i = 0; i < suits.length; i++) {
      for (var j = 1; j < 14; j++) {
        var card = new PlayingCard(suits[i], j);
        cards.push(card);
      }
    }

    return cards;
  }

  getCards() {
    var result = [];

    for (var i = 0; i < this.cards.length; i++) {
      var faceValueName = ""
      switch (this.cards[i].faceValue) {
        case 1:
          faceValueName = "ace";
          break;

        case 11:
          faceValueName = "jack";
          break;
        
        case 12:
          faceValueName = "queen";
          break;

        case 13:
          faceValueName = "king";
          break;

        default:
          faceValueName = this.cards[i].faceValue;
          break;
      }

      result.push(faceValueName + " of " + this.cards[i].suit);
    }

    return result;
  }

  shuffle() {
    for (let i = 0; i < this.cards.length; i++) {
      const indexA = Math.floor(Math.random() * i);
      const indexB = i;
  
      const valueA = this.cards[indexA];
      const valueB = this.cards[indexB];
  
      this.cards[indexA] = valueB;
      this.cards[indexB] = valueA;
    }
  }

  deal() {
    const card = this.cards.splice(0, 1)[0];
    return card;
  }
};

const playingCards = new PlayingCardDeck();
const deckInOrder = playingCards.getCards();
for (const card of deckInOrder) {
  console.log(card);
}

module.exports = {
  PlayingCardDeck
};