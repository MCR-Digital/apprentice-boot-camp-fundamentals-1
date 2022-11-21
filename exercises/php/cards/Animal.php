<?php

namespace McrDigital\PhpFundamentals1\Cards;

class Animal
{
    private string $animalName;

    public function __construct(string $animalName)
    {
        $this->animalName = $animalName;
    }

    public function __toString(): string
    {
        return $this->animalName;
    }


}