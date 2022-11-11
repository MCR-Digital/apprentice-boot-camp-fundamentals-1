class Receipt {
  constructor() {
    this.text = '';
    this.aCountdown = 3;
    this.total = 0;
    this.bCountdown = 2;
  }

  getText() {
    return this.text + "Total: " + this.total;
  };

  scannedA() {
    this.text += 'A: 50';
    if (--this.aCountdown == 0) {
      this.text += ' - 20 (3 for 130)';
      this.total += 30;
    } else {
      this.total += 50;
    }
    this.text += '\n';
  };

  scannedB() {
    this.text += 'B: 30';
    if (--this.bCountdown == 0) {
      this.text += ' - 15 (2 for 45)';
      this.total += 15;
    } else {
      this.total += 30;
    }
    this.text += '\n';
  };

  scannedC() {
    this.text += 'C: 20\n';
    this.total += 20;
  };

  scannedD() {
    this.text += 'D: 15\n';
    this.total += 15;
  };
};

module.exports = {
  Receipt
};