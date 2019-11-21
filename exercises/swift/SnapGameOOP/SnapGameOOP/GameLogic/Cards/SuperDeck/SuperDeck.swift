//
//  SuperDeck.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

class SuperDeck {
    
    private var cards = [Card]()
    
    init(decks: [Deck]) {
        decks.forEach { (deck) in
            cards.append(contentsOf: deck.getCards())
        }
    }
    
    init() {
        let animalDeck = AnimalDeck()
        let playingDeck = PlayingDeck.generateNewDeck()
        let decks: [Deck] = [animalDeck, playingDeck]
        decks.forEach{ (deck) in
            cards.append(contentsOf: deck.getCards())
        }
    }
    
}

extension SuperDeck: Deck {
    
    func getCards() -> [Card] {
        return cards
    }
    
    func shuffle() {
        cards.shuffle()
    }
    
    func deal() -> Card {
        return cards.remove(at: 0)
    }
    
}
