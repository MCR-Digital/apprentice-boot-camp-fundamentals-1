
//
//  AnimalCard.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

class AnimalCard {
    
    private let animal: Animal
    
    init(animal: Animal) {
        self.animal = animal
    }

}

extension AnimalCard: Card {
    func snap(otherCard: Card) -> Bool {
        return otherCard is AnimalCard && self.getValue() == otherCard.getValue()
    }
    
    func getValue() -> String {
        self.animal.value()
    }
}
