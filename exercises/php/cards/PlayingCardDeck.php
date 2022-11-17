<?php

namespace McrDigital\PhpFundamentals1\Cards;

class PlayingCardDeck extends Deck
{
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

}
