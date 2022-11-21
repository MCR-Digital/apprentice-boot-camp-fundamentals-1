<?php

namespace McrDigital\PhpFundamentals1\Cards;

class Suit
{
    private string $suitName;

    public function __construct(string $suitName)
    {
        $this->suitName = $suitName;
    }

    public function __toString(): string
    {
        return $this->suitName;
    }

}