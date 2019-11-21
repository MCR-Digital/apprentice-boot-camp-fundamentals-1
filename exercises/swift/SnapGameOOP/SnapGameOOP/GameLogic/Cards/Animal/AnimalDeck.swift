//
//  AnimalDeck.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

class AnimalDeck {
    
    private var cards = [AnimalCard]()
    
    init() {
        for animal in Animal.allCases {
            for _ in 0...CardConfig.Animal.numberOfDuplicates {
                cards.append(AnimalCard(animal: animal))
            }
        }
    }
}

extension AnimalDeck: Deck {
    
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
