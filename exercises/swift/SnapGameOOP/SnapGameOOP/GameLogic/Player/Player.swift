//
//  Player.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//  Copyright © 2019 Andrew Harris. All rights reserved.
//

import Foundation

enum Player {
    case one
    case two
    
    func playerText() -> String {
        switch self {
        case .one: return "Player 1"
        case .two: return "Player 2"
        }
    }
}
