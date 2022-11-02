class CardStockDeck {
  constructor() {
    this.cards = [];
  }

  getCards() {
    const result = [];    
    for (let i = 0; i < this.cards.length; i++) {
      const card = this.cards[i];
      result.push(card.toString());
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
}

module.exports = {
  CardStockDeck
}