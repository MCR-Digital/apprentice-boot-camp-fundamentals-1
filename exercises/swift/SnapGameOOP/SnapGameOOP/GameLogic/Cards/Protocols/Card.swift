//
//  Card.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

protocol Card{
    
    func snap(otherCard: Card) -> Bool
    func getValue() -> String
    
}
