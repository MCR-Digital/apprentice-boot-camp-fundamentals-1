//
//  Increment.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//  Copyright © 2019 Andrew Harris. All rights reserved.
//

import Foundation

enum IncrementType {
    
    case increment(Value)
    case decrement(Value)
    
    enum Value {
        case one
        case custom(Int)
        
        func getValue() -> Int {
            switch self {
            case .one:
                return 1
            case .custom(let num):
                return num
            }
        }
    }
    
}

extension IncrementType {
    
    func calculate() -> Int {
        switch self {
        case .increment(let val):
            return val.getValue()
        case .decrement(let val):
            return -(val.getValue())
        }
    }
    
}


