<?php

namespace McrDigital\PhpFundamentals1\Cards;

class PlayingCardDeck
{
    private array $cards;

    public function __construct()
    {
        $cSuits = new Suit();
        $this->cards = [];

        foreach ($cSuits->suit as $suit) {
            for ($faceValue = 0; $faceValue < 13; $faceValue++) {
                $this->cards[] = new PlayingCard($suit, $faceValue);
            }
        }
    }

    public function getCards(): array
    {
        $result = [];
        foreach ($this->cards as $card) {
            $result[] = strval($card);
        }
        return $result;
    }

    public function shuffle(): void
    {
        for ($i = 0; $i < count($this->cards); ++$i) {
            $indexA = rand(0, $i);
            $indexB = $i;

            $valueA = $this->cards[$indexA];
            $valueB = $this->cards[$indexB];

            $this->cards[$indexA] = $valueB;
            $this->cards[$indexB] = $valueA;
        }
    }

}

$cards = new PlayingCardDeck();
$deckInOrder = $cards->getCards();

foreach ($deckInOrder as $card) {
    echo $card . PHP_EOL;
}