<?php

namespace McrDigital\PhpFundamentals1\Cards;

interface Card
{
    public function snap(?Card $card): bool;
}