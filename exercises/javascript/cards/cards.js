// to execute the runnable code in this file, use the command
// `node cards/cards.js` from the command line positioned at
// the project's root directory.
// return deck of cards in order formatted correctly ace - king

//command D +-

class Card {
  constructor(faceValue, suit) {
    this.faceValue = faceValue; //0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
    this.suit = suit; //0 (clubs), 1 (diamonds), 2 (hearts), 3 (spades)
  }

  getFormattedCard() {
    let cardNumber = 0;

    let faceValueName;
    switch (this.faceValue) {
      case 0:
        faceValueName = "ace";
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
        faceValueName = (this.faceValue + 1).toString();
        break;
      case 10:
        faceValueName = "jack";
        break;
      case 11:
        faceValueName = "queen";
        break;
      case 12:
        faceValueName = "king";
        break;
      default:
        throw new Error(
          "Something went wrong " +
            this.faceValue +
            " is not a valid faceValue!"
        );
    }

    let suitName;
    switch (this.suit) {
      case 0:
        suitName = "clubs";
        break;
      case 1:
        suitName = "diamonds";
        break;
      case 2:
        suitName = "hearts";
        break;
      case 3:
        suitName = "spades";
        break;
      default:
        throw new Error(
          "Something went wrong " + this.suit + " is not a valid suitName!"
        );
    }

    return faceValueName + " of " + suitName;
  }

  
  snap(previousCard) {
    console.log(previousCard);
    console.log(this.faceValue)
    return (  previousCard.faceValue === this.faceValue)   

  }
  
}

class Deck {
  constructor() {
    this.cards = []; //empty array of cards
    // this.suits = [0, 1, 2, 3];
    for (let suit = 0; suit < 4; suit++) {
      for (let faceValue = 0; faceValue < 13; faceValue++) {
        const newCard = new Card(faceValue, suit);
        //  this.cards[suit * 13 + faceValue] = newCard;
        //or
        this.cards.push(newCard.getFormattedCard());
      }
    }
  }

  getCards() {
    return this.cards;
  }


  shuffle() {
    for (let i = 0; i < this.cards.length; i++) {
      let indexA = Math.floor(Math.random() * i);
      let indexB = i;

      let valueA = this.cards[indexA];
      let valueB = this.cards[indexB];

      this.cards[indexA] = valueB;
      this.cards[indexB] = valueA;
    }
    return this.cards;
  }

  deal() {
    let card = this.cards.splice(0, 1)[0];
    return card;
  };
}

// const exampleDeck = new Deck();
// console.log(exampleDeck.createCardDeck());

const exampleShuffledDeck = new Deck();
// console.log(exampleShuffledDeck.shuffle());
exampleShuffledDeck.shuffle();
// console.log(exampleShuffledDeck.deal());

// const exampleCard = new Card("hearts", 6);

// console.log(exampleCard); //print out an object //Card { suit: 'hearts', value: 6 }

//export the objects Deck and Card
// key: deck value: Deck
//key: card value: Card

module.exports = {
  Deck: Deck,
  Card: Card,
};
