//
//  UIView+AnimateColour.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 20/11/2019.
//  Copyright © 2019 Andrew Harris. All rights reserved.
//

import UIKit

extension UIView {
    
    @discardableResult
    func setBackgroundColour(toColour colour: UIColor) -> Self {
        backgroundColor = colour
        return self
    }
}
