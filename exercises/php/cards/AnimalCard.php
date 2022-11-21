<?php

namespace McrDigital\PhpFundamentals1\Cards;

use Exception;

class AnimalCard implements Card
{
    private Animal $animal;

    public function __construct(Animal $animal)
    {
        $this->animal = $animal;
    }

    public function __toString(): string
    {
        return strval($this->animal);
    }

    public function snap(?Card $card): bool
    {
        if (is_null($card)) {
            return false;
        }

        if (!($card instanceof AnimalCard)) {
            throw new Exception("Cannot compare mismatched card types!");
        }

        return $this->animal === $card->animal;
    }

}