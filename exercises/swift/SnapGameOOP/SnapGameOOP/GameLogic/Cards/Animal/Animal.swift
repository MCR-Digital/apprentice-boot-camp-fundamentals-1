//
//  Animal.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

public enum Animal: String, CaseIterable {
    
    case AARDVARK
    case BABOON
    case CAMEL
    case DEER
    case ELEPHANT
    case FROG
    case GORILLA
    case HARE
    case IMPALA
    case JAGUAR
    case KANGAROO
    case LION
    case MOOSE
    case NEWT
    case OCTOPUS
    case PENGUIN
    case QUETZAL
    case RABBIT
    case SALMON
    case TORTOISE
    case UAKARIS
    case VAQUITA
    case WHALE
    case X_RAY_TETRA
    case YAK
    case ZEBRA
    
    func value() -> String {
        return self.rawValue
    }
    
}
