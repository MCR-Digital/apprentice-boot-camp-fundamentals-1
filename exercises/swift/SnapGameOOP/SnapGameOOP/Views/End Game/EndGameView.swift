//
//  EndGameView.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 20/11/2019.
//  Copyright © 2019 Andrew Harris. All rights reserved.
//

import UIKit

class EndGameView: UIView {

    @IBOutlet weak var gameOverLabel: UILabel!
    @IBOutlet weak var scoreLabel: UILabel!
    @IBOutlet weak var restartButton: UIButton!
   
    override func awakeFromNib() {
        setup()
    }
    
    private func setup() {
        gameOverLabel.textColor = Colours.Text.dark
        scoreLabel.textColor = Colours.Text.dark
        restartButton.setTitleColor(Colours.Text.white, for: .normal)
        
        restartButton.layer.cornerRadius = Constants.Sizes.cornerRadius
        restartButton.layer.masksToBounds = true
        
        self.layer.cornerRadius = Constants.Sizes.cornerRadius
        self.layer.masksToBounds = true
    }
    
    func setWinner(withResult result: Result) {
        switch result {
        case .player(let playerScore):
            scoreLabel.text = "\(playerScore.player.playerText()) won with a score of \(playerScore.score)"
        case .draw:
            scoreLabel.text = "It's a Draw!"
        }
    }
    

}
