namespace McrDigital.Bootcamp1.Checkout {
  using System;

  public class Receipt {
    private string _text = String.Empty;
    private int _aCountdown = 3;
    private int _total;
    private int _bCountdown = 2;

    public string Text {
      get => $"{this._text}Total: {this._total}";
    }

    public void ScannedA() {
      this._text = $"{this._text}A: 50";
      if (--this._aCountdown == 0) {
        this._text = $"{this._text} - 20 (3 for 130)";
        this._total += 30;
      } else {
        this._total += 50;
      }
      this._text = $"{this._text}\n";
    }

    public void ScannedB() {
      this._text = $"{this._text}B: 30";
      if (--this._bCountdown == 0) {
        this._text = $"{this._text} - 15 (2 for 45)";
        this._total += 15;
      } else {
        this._total += 30;
      }
      this._text = $"{this._text}\n";
    }

    public void ScannedC() {
      this._text = $"{this._text}C: 20\n";
      this._total += 20;
    }

    public void ScannedD() {
      this._text = $"{this._text}D: 15\n";
      this._total += 15;
    }
  }
}