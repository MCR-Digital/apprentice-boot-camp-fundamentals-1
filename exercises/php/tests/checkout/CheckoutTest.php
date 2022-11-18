<?php

namespace McrDigital\PhpFundamentals1\Checkout;

use PHPUnit\Framework\TestCase;

class CheckoutTest extends TestCase
{
    public function testShouldScanOneA(): void
    {
        $checkout = new Checkout();

        $checkout->scan('A');

        $this->assertEquals(50, $checkout->getTotal());
    }

    public function testShouldScanTwoAs(): void
    {
        $checkout = new Checkout();

        $checkout->scan('A');
        $checkout->scan('A');

        $this->assertEquals(100, $checkout->getTotal());
    }

    public function testShouldScanThreeAs(): void
    {
        $checkout = new Checkout();

        $checkout->scan('A');
        $checkout->scan('A');
        $checkout->scan('A');

        $this->assertEquals(130, $checkout->getTotal());
    }

    public function testShouldScanSixAs(): void
    {
        $checkout = new Checkout();

        $checkout->scan('A');
        $checkout->scan('A');
        $checkout->scan('A');
        $checkout->scan('A');
        $checkout->scan('A');
        $checkout->scan('A');

        $this->assertEquals(260, $checkout->getTotal());
    }

    public function testShouldScanOneB(): void
    {
        $checkout = new Checkout();

        $checkout->scan('B');

        $this->assertEquals(30, $checkout->getTotal());
    }

    public function testShouldScanTwoBs(): void
    {
        $checkout = new Checkout();

        $checkout->scan('B');
        $checkout->scan('B');

        $this->assertEquals(45, $checkout->getTotal());
    }

    public function testShouldScanFourBs(): void
    {
        $checkout = new Checkout();

        $checkout->scan('B');
        $checkout->scan('B');
        $checkout->scan('B');
        $checkout->scan('B');

        $this->assertEquals(90, $checkout->getTotal());
    }

    public function testShouldScanABCD(): void
    {
        $checkout = new Checkout();

        $checkout->scan('A');
        $this->assertEquals(50, $checkout->getTotal());

        $checkout->scan('B');
        $this->assertEquals(80, $checkout->getTotal());

        $checkout->scan('C');
        $this->assertEquals(100, $checkout->getTotal());

        $checkout->scan('D');
        $this->assertEquals(115, $checkout->getTotal());
    }
}
