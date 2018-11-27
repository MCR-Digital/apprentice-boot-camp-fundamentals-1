package cards;

class SuperSnapDeck extends Deck{
    SuperSnapDeck() {
        AnimalDeck animalDeck = new AnimalDeck();
        PokerDeck pokerDeck = new PokerDeck();
        cards.addAll(animalDeck.getCards());
        cards.addAll(pokerDeck.getCards());
    }
}
