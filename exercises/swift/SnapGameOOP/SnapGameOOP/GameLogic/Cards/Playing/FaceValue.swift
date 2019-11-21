//
//  FaceValue.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

class FaceValue {
    
    private var value: Int
    
    init(value: Int) {
        self.value = value
    }
    
    public func convertValueToString() -> String {
        var faceValue = String(value)
        switch value {
        case 1:
            faceValue = "ace"
        case 10:
            faceValue = "jack"
        case 11:
            faceValue = "queen"
        case 12:
            faceValue = "king"
        default: break
        }
        return faceValue;
    }
    
    
}
