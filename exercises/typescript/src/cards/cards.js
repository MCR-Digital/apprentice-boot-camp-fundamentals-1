// to execute the runnable code in this file, use the command
// `node cards/cards.js` from the command line positioned at
// the project's root directory.

class Cards {
  getCards() {
    const result = []
    const deck = []

    for (let suit = 0; suit < 4; suit++) {
      for (let faceValue = 0; faceValue < 13; faceValue++) {
        deck.push([suit, faceValue])
      }
    }

    let cardNumber = 0
    for (let card of deck) {
      let faceValueName
      switch (card[1]) {
      case 0:
        faceValueName = "ace"
        break
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
        faceValueName = (card[1] + 1).toString()
        break
      case 10:
        faceValueName = "jack"
        break
      case 11:
        faceValueName = "queen"
        break
      case 12:
        faceValueName = "king"
        break
      default:
        throw new Error("Something went wrong " + card[1] + " is not a valid faceValue!")
      }

      let suitName
      switch (card[0]) {
      case 0: suitName = "clubs"; break
      case 1: suitName = "diamonds"; break
      case 2: suitName = "hearts"; break
      case 3: suitName = "spades"; break
      default: throw new Error("Something went wrong " + card[0] + " is not a valid suitName!")
      }

      result[cardNumber] = faceValueName + " of " + suitName
      cardNumber++
    }

    return result
  }
}

const cards = new Cards()
const deckInOrder = cards.getCards()

for (const card of deckInOrder) {
  console.log(card)
}

module.exports = {
  Cards
}