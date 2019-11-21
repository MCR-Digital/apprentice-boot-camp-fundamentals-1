//
//  UIView+Animate.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 20/11/2019.
//  Copyright © 2019 Andrew Harris. All rights reserved.
//

import UIKit

extension UIView {
    
    func animateIn(withDuration duration: Double = 0.5) {
        self.transform = self.transform.scaledBy(x: 0.001, y: 0.001)
        self.alpha = 1.0
        UIView.animate(withDuration: duration, delay: 0.0, usingSpringWithDamping: 0.5, initialSpringVelocity: 0.3, options: [.curveEaseInOut, .allowUserInteraction], animations: {
              self.transform = CGAffineTransform.identity.scaledBy(x: 1.0, y: 1.0)
          }, completion: nil)
    }
    
    func animateOut(withDuration duration: Double = 0.5) {
        self.transform = self.transform.scaledBy(x: 1.0, y: 1.0)
        self.alpha = 1.0
        UIView.animate(withDuration: duration, delay: 0.0, usingSpringWithDamping: 0.5, initialSpringVelocity: 0.3, options: [.curveEaseInOut, .allowUserInteraction], animations: {
            self.alpha = 0.0
            self.transform = CGAffineTransform.identity.scaledBy(x: 0.001, y: 0.001)
          }, completion: nil)
    }
    
    func fadeIn(withDuration duration: Double = 0.5) {
        UIView.animate(withDuration: duration, delay: 0.0, options: [.curveEaseInOut, .allowUserInteraction], animations: {
            self.alpha = 1.0
        }, completion: nil)
    }
    
    func fadeOut(withDuration duration: Double = 0.5) {
        UIView.animate(withDuration: duration, delay: 0.0, options: [.curveEaseInOut, .allowUserInteraction], animations: {
            self.alpha = 0.0
        }, completion: nil)
    }
    
}
