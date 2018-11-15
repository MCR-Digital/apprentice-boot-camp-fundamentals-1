namespace McrDigital.Bootcamp1.Checkout.Tests {
  using System;
  using Xunit;
  using McrDigital.Bootcamp1.Checkout;

  public class ReceiptTests {
    [Fact]
    public void SingleItem() {
      var checkout = new Checkout();
      checkout.Scan("A");
      Assert.Equal(new string[] {
        "A: 50",
        "Total: 50"
      }, checkout.Receipt.Split("\n"));
    }

    [Fact]
    public void OneOfEach() {
      var checkout = new Checkout();

      checkout.Scan("A");
      checkout.Scan("B");
      checkout.Scan("C");
      checkout.Scan("D");

      Assert.Equal(new string[] {
        "A: 50",
        "B: 30",
        "C: 20",
        "D: 15",
        "Total: 115"
      }, checkout.Receipt.Split("\n"));
    }

    [Fact]
    public void Offers() {
      var checkout = new Checkout();

      checkout.Scan("A");
      checkout.Scan("A");
      checkout.Scan("B");
      checkout.Scan("A");
      checkout.Scan("C");
      checkout.Scan("D");
      checkout.Scan("B");

      Assert.Equal(new string[] {
        "A: 50",
        "A: 50",
        "B: 30",
        "A: 50 - 20 (3 for 130)",
        "C: 20",
        "D: 15",
        "B: 30 - 15 (2 for 45)",
        "Total: 210"
      }, checkout.Receipt.Split("\n"));
    }
  }
}