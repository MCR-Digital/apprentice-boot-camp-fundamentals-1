<?php declare(strict_types=1);

namespace McrDigital\PhpFundamentals1\Cards;

use PHPUnit\Framework\TestCase;

class AnimalDeckTest extends TestCase
{
    private array $testCards;

    public function testCanReturn52CorrectlyFormattedCards(): void
    {
        $expectedCards = $this->testCards;

        $animalDeck = new CAnimalDeck();
        $cards = $animalDeck->getCards();

        $this->assertEquals($expectedCards, $cards);
    }

    public function testCanShuffleCardsInAnyOrder(): void
    {
        $expectedCards = $this->testCards;

        $animalDeck = new CAnimalDeck();
        $animalDeck->shuffle();
        $cards = $animalDeck->getCards();

        $this->assertCount(count($expectedCards), $cards);
        $this->assertEqualsCanonicalizing($expectedCards, $cards);
    }

    protected function setUp(): void
    {
        $cAnimal = new CAnimal();
        foreach ($cAnimal->animal as $animal) {
            $this->testCards[] = new CAnimalCard($animal);
            $this->testCards[] = new CAnimalCard($animal);
        }
    }

    protected function tearDown(): void
    {
        $this->testCards = [];
    }

}
