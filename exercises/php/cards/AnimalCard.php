<?php

namespace McrDigital\PhpFundamentals1\Cards;

use Exception;

class AnimalCard extends Card
{
    private string $animal;

    public function __construct(string $animal)
    {
        $this->animal = $animal;
    }

    public function __toString(): string
    {
        return $this->animal;
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