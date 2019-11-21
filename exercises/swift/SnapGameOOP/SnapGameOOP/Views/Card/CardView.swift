//
//  CardView.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 20/11/2019.
//  Copyright © 2019 Andrew Harris. All rights reserved.
//

import UIKit

class CardView: UIView {

    @IBOutlet weak var cardIconLabel: UILabel!
    @IBOutlet weak var cardFaceValueLabel: UILabel!
    
    var card: Card!

    func set(card: Card?) {
        
        guard let card = card else { setCardIconLabel(iconText: ""); setCardFaceValueLabel(faceValue: "Empty"); return }
        
        self.setCardFaceValueLabel(faceValue: card.getValue())
        
        if card is PlayingCard {
            self.setCardIconLabel(iconText: "🃏")
        }else if card is AnimalCard {
            self.setCardIconLabel(iconText: "🐾")
        }else{
            self.setCardIconLabel(iconText: "")
        }
        
    }
    
    private func setCardIconLabel(iconText: String) {
        self.cardIconLabel.text = iconText
    }
    
    private func setCardFaceValueLabel(faceValue: String) {
        self.cardFaceValueLabel.text = faceValue
    }
    
}
