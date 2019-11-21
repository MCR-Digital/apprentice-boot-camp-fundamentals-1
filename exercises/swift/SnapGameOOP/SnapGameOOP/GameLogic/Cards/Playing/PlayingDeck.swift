//
//  PlayingDeck.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

class PlayingDeck {
    
    private var cards: [PlayingCard]
    
    init(cards: [PlayingCard]) {
        self.cards = cards
    }
    
    init() {
        self.cards = PlayingDeck.generateNewDeck().cards
    }
    
    public static func generateNewDeck() -> PlayingDeck {
        
        var allCards = [PlayingCard]()
        
        for i in 0..<CardConfig.Playing.numberOfSuits {
            let suit = Suit.parse(num: i)
            let cardsForSuit = self.generateCardsForSuit(suit: suit)
            allCards.append(contentsOf: cardsForSuit)
        }
        
        return PlayingDeck(cards: allCards)
        
    }
    
    private static func generateCardsForSuit(suit: Suit) -> [PlayingCard] {
        var newCardsForSuit = [PlayingCard]()
        for i in 0...CardConfig.Playing.numberOfCardsInSuit {
            let cardValue = FaceValue(value: i)
            let newestCard = PlayingCard(value: cardValue, suit: suit)
            newCardsForSuit.append(newestCard)
        }
        return newCardsForSuit
    }
    
}

// MARK: Deck Protocol Methods
extension PlayingDeck: Deck {
    
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
