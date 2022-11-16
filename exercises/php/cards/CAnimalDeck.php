<?php

namespace McrDigital\PhpFundamentals1\Cards;

class CAnimalDeck
{
    private array $cards;

    public function __construct()
    {
        $this->cards = [];

        $cAnimal = new CAnimal();
        foreach ($cAnimal->animal as $animal) {
            $this->cards[] = new CAnimalCard($animal);
            $this->cards[] = new CAnimalCard($animal);
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

    public function deal(): CAnimalCard
    {
        $card = array_splice($this->cards, 0, 1)[0];
        return $card;
    }

}