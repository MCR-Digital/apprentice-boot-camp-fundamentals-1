//
//  PlayingCard.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

class PlayingCard {
    
    private var value: FaceValue
    private var suit: Suit
    
    init(value: FaceValue, suit: Suit) {
        self.value = value
        self.suit = suit
    }
    
}

// MARK: Card Protocol Methods
extension PlayingCard: Card {
    
    func snap(otherCard: Card) -> Bool {
        return otherCard is PlayingCard && self.getValue() == otherCard.getValue()
    }
    
    func getValue() -> String {
        return value.convertValueToString()
    }
    
}
