<?php

namespace McrDigital\PhpFundamentals1\Cards;

abstract class Card
{
    abstract function snap(?Card $card);
}