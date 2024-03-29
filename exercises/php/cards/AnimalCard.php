<?php

namespace McrDigital\PhpFundamentals1\Cards;

class AnimalCard
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

    public function snap(AnimalCard|null $card): bool
    {
        return !!$card && $this->animal === $card->animal;
    }

}