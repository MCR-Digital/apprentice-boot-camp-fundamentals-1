<?php

namespace McrDigital\PhpFundamentals1\Cards;

class AnimalDeck extends Deck
{
    public function __construct()
    {
        $this->cards = [];

        $cAnimal = new Animal();
        foreach ($cAnimal->animal as $animal) {
            $this->cards[] = new AnimalCard($animal);
            $this->cards[] = new AnimalCard($animal);
        }
    }

}