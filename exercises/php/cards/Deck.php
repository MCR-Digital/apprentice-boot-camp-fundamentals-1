<?php

namespace McrDigital\PhpFundamentals1\Cards;

interface Deck
{
    public function getCards(): array;

    public function deal(): Card;

    public function shuffle(): void;

}