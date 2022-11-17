<?php

namespace McrDigital\PhpFundamentals1\Cards;

use Exception;

class PlayingCard implements Card
{
    private string $suit;
    private int $faceValue;

    public function __construct(string $suit, int $faceValue)
    {
        $this->suit = $suit;
        $this->faceValue = $faceValue;
    }

    public function __toString(): string
    {
        $faceValueName = "";

        switch ($this->getFaceValue()) {
            case 0:
                $faceValueName = "ace";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                $faceValueName = strval($this->getFaceValue() + 1);
                break;
            case 10:
                $faceValueName = "jack";
                break;
            case 11:
                $faceValueName = "queen";
                break;
            case 12:
                $faceValueName = "king";
                break;
            default:
                throw new Exception("Something went wrong {$this->getFaceValue()} is not a valid faceValue!");
        }

        return "{$faceValueName} of {$this->getSuit()}";
    }

    public function getFaceValue(): int
    {
        return $this->faceValue;
    }

    public function getSuit(): string
    {
        return $this->suit;
    }

    public function snap(?Card $card): bool
    {
        if (is_null($card)) {
            return false;
        }

        return $card instanceof PlayingCard && $this->getFaceValue() === $card->getFaceValue();
    }

}