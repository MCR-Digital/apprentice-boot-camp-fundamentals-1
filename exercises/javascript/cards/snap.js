const {AnimalDeck} = require('./animal-deck.js');
const readline = require('readline');

// to execute the runnable code in this file, use the command
// 'node cards/snap.js' from the command line positioned at the
// root directory of this project.

class Snap {
  constructor(deck) {
    this.player1Score = 0;
    this.player2Score = 0;
    this.deck = deck;
    deck.shuffle();
  }
}

Snap.prototype.play = async function () {
  let currentCard = null;
  let previousCard = null;

  while (this.deck.getCards().length > 0) {
    let rl = readline.createInterface({
      input: process.stdin,
      output: process.stdout,
      prompt: 'play snap> '
    });
    rl.prompt();
    currentCard = this.deck.deal();
    console.log(currentCard.animal);

    for await (let line of rl) {
      if (line.length > 0 && line.charAt(0).toLowerCase() === 'a') {
        if (currentCard.snap(previousCard)) {
          console.log('SNAP! score Player 1');
          this.player1Score++;
        } else {
          console.log('WRONG! deducting score from Player 1');
          this.player1Score--;
        }
      } else if (line.length > 0 && line.charAt(0).toLowerCase() === 'l') {
        if (currentCard.snap(previousCard)) {
          console.log('SNAP! scorePlayer 2');
          this.player2Score++;
        } else {
          console.log('WRONG! deducting score from Player 2');
          this.player2Score--;
        }
      }
      previousCard = currentCard;
      rl.close();
    }
  }

  if (this.player1Score === this.player2Score) {
    console.log('Draw');
  } else if (this.player1Score > this.player2Score) {
    console.log('Player 1 wins!');
  } else {
    console.log('Player 2 wins!');
  }

  console.log('Scores: ' + this.player1Score + ' vs ' + this.player2Score);
  process.exit(0);
};

let animalDeck = new AnimalDeck();
let snap = new Snap(animalDeck);
snap.play();