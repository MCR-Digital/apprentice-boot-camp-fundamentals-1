//
//  Deck.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

protocol Deck{
    
    func getCards() -> [Card]
    func shuffle()
    func deal() -> Card
    
}
