//
//  Suit.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

public enum Suit: String {
    case clubs
    case diamonds
    case hearts
    case spades
}

extension Suit {
    public static func parse(num: Int) -> Suit {
        switch num {
        case 0: return Suit.clubs
        case 1: return Suit.diamonds
        case 2: return Suit.hearts
        case 3: return Suit.spades
        default: fatalError("suit does not exist")
        }
    }
}
