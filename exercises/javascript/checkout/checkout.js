const { Receipt } = require('./receipt.js');

class Checkout {
  constructor() {
    this.total = 0;
    this.numberOfA = 0;
    this.numberOfB = 0;
    this.receipt = new Receipt();
  }

  scan(sku) {
    if ('A' === sku) {
      this.total += 50;
      this.receipt.scannedA();
    } else if ('B' === sku) {
      this.total += 30;
      this.receipt.scannedB();
    } else if ('C' === sku) {
      this.total += 20;
      this.receipt.scannedC();
    } else if ('D' === sku) {
      this.total += 15;
      this.receipt.scannedD();
    }
  
    if ('A' === sku) {
      this.numberOfA++;
      if (this.numberOfA % 3 === 0) {
        this.total -= 20;
      }
    } else if ('B' === sku) {
      this.numberOfB++;
      if (this.numberOfB % 2 === 0) {
        this.total -= 15;
      }
    }
  };

  getTotal() {
    return this.total;
  };

  getReceipt() {
    return this.receipt.getText();
  };
};

module.exports = {
  Checkout
};