//
//  CALayer+Shadow.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 20/11/2019.
//  Copyright © 2019 Andrew Harris. All rights reserved.
//

import UIKit

extension CALayer {
    
    func applySketchShadow(
        color: UIColor = UIColor(red: 0/255, green: 0/255, blue: 0/255, alpha: 1.0),
        alpha: Float = 0.08,
        x: CGFloat = 0,
        y: CGFloat = 0,
        blur: CGFloat = 10,
        spread: CGFloat = 0)
    {
        shadowColor = color.cgColor
        shadowOpacity = alpha
        shadowOffset = CGSize(width: x, height: y)
        shadowRadius = blur / 2.0
        if spread == 0 {
            shadowPath = nil
        } else {
            let dx = -spread
            let rect = bounds.insetBy(dx: dx, dy: dx)
            shadowPath = UIBezierPath(rect: rect).cgPath
        }
        self.shouldRasterize = true
        self.rasterizationScale = UIScreen.main.scale
    }
}
