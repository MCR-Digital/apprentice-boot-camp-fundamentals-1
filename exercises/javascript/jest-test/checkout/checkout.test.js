const { Checkout } = require('../../checkout/checkout.js');

describe('Checkout', function () {
  test('scans one A', function () {
    let checkout = new Checkout();
    checkout.scan('A');
    expect(checkout.getTotal()).toBe(50);
  });

  test('scans two As', function () {
    let checkout = new Checkout();
    checkout.scan('A');
    checkout.scan('A');
    expect(checkout.getTotal()).toBe(100);
  });

  test('scans three As', function () {
    let checkout = new Checkout();
    checkout.scan('A');
    checkout.scan('A');
    checkout.scan('A');
    expect(checkout.getTotal()).toBe(130);
  });

  test('scans six As', function () {
    let checkout = new Checkout();
    checkout.scan('A');
    checkout.scan('A');
    checkout.scan('A');
    checkout.scan('A');
    checkout.scan('A');
    checkout.scan('A');
    expect(checkout.getTotal()).toBe(260);
  });

  test('scans one B', function () {
    let checkout = new Checkout();
    checkout.scan('B');
    expect(checkout.getTotal()).toBe(30);
  });

  test('scans two Bs', function () {
    let checkout = new Checkout();
    checkout.scan('B');
    checkout.scan('B');
    expect(checkout.getTotal()).toBe(45);
  });


  test('scans four Bs', function () {
    let checkout = new Checkout();
    checkout.scan('B');
    checkout.scan('B');
    checkout.scan('B');
    checkout.scan('B');
    expect(checkout.getTotal()).toBe(90);
  });

  test('simple, scans A, B, C, and D', function () {
    let checkout = new Checkout();
    checkout.scan('A');
    expect(checkout.getTotal()).toBe(50);

    checkout.scan('B');
    expect(checkout.getTotal()).toBe(80);

    checkout.scan('C');
    expect(checkout.getTotal()).toBe(100);

    checkout.scan('D');
    expect(checkout.getTotal()).toBe(115);
  });
});