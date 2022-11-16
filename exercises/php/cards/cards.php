<?php

class Cards
{
    public function getCards(): array
    {
        $result = [];
        $deck = [];

        for ($suit = 0; $suit < 4; $suit++) {
            for ($faceValue = 0; $faceValue < 13; $faceValue++) {
                $deck[] = [$suit, $faceValue];
            }
        }

        $cardNumber = 0;
        foreach ($deck as $card) {
            $faceValueName = "";
            switch ($card[1]) {
                case 0:
                    $faceValueName = 'ace';
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
                    $faceValueName = strval($card[1] + 1);
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
                    throw new Exception("Something went wrong " . $card[1] . " is not a valid faceValue!");
            }

            $suitName = "";
            switch ($card[0]) {
                case 0:
                    $suitName = "clubs";
                    break;
                case 1:
                    $suitName = "diamonds";
                    break;
                case 2:
                    $suitName = "hearts";
                    break;
                case 3:
                    $suitName = "spades";
                    break;
                default:
                    throw new Exception("Something went wrong " . $card[0] . " is not a valid suitName!");
            }

            $result[$cardNumber] = $faceValueName . " of " . $suitName;
            $cardNumber++;
        }

        return $result;
    }

}

$cards = new Cards();
$deckInOrder = $cards->getCards();

foreach ($deckInOrder as $card) {
    echo $card . PHP_EOL;
}