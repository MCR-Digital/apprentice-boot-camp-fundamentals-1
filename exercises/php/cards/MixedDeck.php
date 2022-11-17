<?php

namespace McrDigital\PhpFundamentals1\Cards;

class MixedDeck implements Deck
{
    private array $cards;

    public function __construct()
    {
        $this->cards = [];

        $animalDeck = new AnimalDeck();
        $playingCardDeck = new PlayingCardDeck();

        for ($cardNo = 0; $cardNo < 52; $cardNo++) {
            $this->cards[] = $animalDeck->deal();
            $this->cards[] = $playingCardDeck->deal();
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

    public function deal(): Card
    {
        $card = array_splice($this->cards, 0, 1)[0];
        return $card;
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