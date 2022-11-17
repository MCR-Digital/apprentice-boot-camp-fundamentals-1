<?php declare(strict_types=1);

namespace McrDigital\PhpFundamentals1\Cards;

use PHPUnit\Framework\TestCase;

class AnimalDeckTest extends TestCase
{
    private array $testCards;

    public function testShouldReturn52CorrectlyFormattedCards(): void
    {
        $expectedCards = $this->testCards;

        $animalDeck = new AnimalDeck();
        $cards = $animalDeck->getCards();

        $this->assertEquals($expectedCards, $cards);
    }

    public function testShouldShuffleCardsInAnyOrder(): void
    {
        $expectedCards = $this->testCards;

        $animalDeck = new AnimalDeck();
        $animalDeck->shuffle();
        $cards = $animalDeck->getCards();

        $this->assertCount(count($expectedCards), $cards);
        $this->assertEqualsCanonicalizing($expectedCards, $cards);
    }

    protected function setUp(): void
    {
        $cAnimal = new Animal();
        foreach ($cAnimal->animal as $animal) {
            $this->testCards[] = new AnimalCard($animal);
            $this->testCards[] = new AnimalCard($animal);
        }
    }

    protected function tearDown(): void
    {
        $this->testCards = [];
    }

}
