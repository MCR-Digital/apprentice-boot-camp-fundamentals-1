//
//  GameViewController.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//  Copyright © 2019 Andrew Harris. All rights reserved.
//
//  TO DO : FLIP Animation
//  https://medium.com/@lawrey/creating-a-flip-card-animation-with-uicollectionviewcell-swift-3-0-98bc96317fee

import UIKit

class GameViewController: UIViewController {
    
    @IBOutlet weak var currentCardUnderView: UIView!
    @IBOutlet weak var currentCardUnder: UIView!
    @IBOutlet weak var previousCardView: UIView!
    @IBOutlet weak var currentCardView: UIView!
    @IBOutlet weak var playerControllerView: UIView!

    @IBOutlet weak var previousCardLabel: UILabel!
    @IBOutlet weak var deckLabel: UILabel!
    
    @IBOutlet weak var player1Label: UILabel!
    @IBOutlet weak var player2Label: UILabel!
    @IBOutlet weak var player1ScoreLabel: UILabel!
    @IBOutlet weak var player2ScoreLabel: UILabel!
    
    /**
     The instance of the game
     */
    var game = SnapGame()
    let currentCard: CardView = .fromNib()
    let previousCard: CardView = .fromNib()
    /**
     The transparent view which will overlay the main view when the game end popup is shown
     */
    var darkView: UIView! =  UIView(frame: UIScreen.main.bounds)
    /**
     The view which pops up to show the game result when the game has ended
     */
    let endGamePopup: EndGameView = .fromNib()
    
    override func viewDidLoad() {
        super.viewDidLoad()

        game.gameDelegate = self
        setup()
        setupEndgame()
        styleCards()
        styleText()
        setBackgroundColour(toSnapType: .nothing)
        
    }
    
    //MARK: game over screen
    private func hideGameOver(animated: Bool = false) {
        animated ? endGamePopup.animateOut() : endGamePopup.animateOut(withDuration: 0)
    }
    
    private func showGameOver(animated: Bool = false) {
        animated ? endGamePopup.animateIn() : endGamePopup.animateIn(withDuration: 0)
    }
    
    private func showDarkView(animated: Bool = false) {
        animated ? darkView.fadeIn() : darkView.fadeIn(withDuration: 0)
    }
    
    private func hideDarkView(animated: Bool = false) {
        animated ? darkView.fadeOut() : darkView.fadeOut(withDuration: 0)
    }
    
    //MARK: Button Actions
    @IBAction func player1DidTap(_ sender: Any) {
        game.pressedPlayer(withPlayer: .one)
    }
    
    @IBAction func player2DidTap(_ sender: Any) {
        game.pressedPlayer(withPlayer: .two)
    }

    @objc
    func restartDidTap(sender: UIButton) {
        self.hideDarkView(animated: true)
        self.hideGameOver(animated: true)
        game.restart()
        setup()
    }
    
    //MARK: set up the view controller
    private func setup() {
        currentCard.set(card: game.getCard(withType: .current))
        previousCard.set(card: game.getCard(withType: .previous))
        player1ScoreLabel.text = "\(game.getScore(forPlayer: .one))"
        player2ScoreLabel.text = "\(game.getScore(forPlayer: .two))"
    }
    
    //MARK: set up the end game view
    private func setupEndgame() {
        
        darkView.setBackgroundColour(toColour: Colours.Views.black.withAlphaComponent(0.5))
        view.addSubview(darkView)
    
        endGamePopup.layer.applySketchShadow()
        endGamePopup.layer.cornerRadius = Constants.Sizes.cornerRadius
        endGamePopup.layer.masksToBounds = false
        view.addSubview(endGamePopup)
        endGamePopup.translatesAutoresizingMaskIntoConstraints = false
        
        endGamePopup.centerXAnchor.constraint(equalTo: self.view.centerXAnchor).isActive = true
        endGamePopup.centerYAnchor.constraint(equalTo: self.view.centerYAnchor).isActive = true
        
        let leading = NSLayoutConstraint(item: endGamePopup, attribute: .leading, relatedBy: .greaterThanOrEqual, toItem: self.view, attribute: .leading, multiplier: 1.0, constant: 60)
        let trailing = NSLayoutConstraint(item: endGamePopup, attribute: .trailing, relatedBy: .greaterThanOrEqual, toItem: self.view, attribute: .trailing, multiplier: 1.0, constant: 60)
        self.view.addConstraints([leading, trailing])
        endGamePopup.restartButton.addTarget(self, action: #selector(self.restartDidTap(sender:)),for: .touchUpInside)
        
        hideDarkView()
        hideGameOver()
    }
}

// MARK: Game Delegate Methods
extension GameViewController: PlayableDelegate {
    
    func onEnd(withResult result: Result) {
        endGamePopup.setWinner(withResult: result)
        self.showDarkView(animated: true)
        self.showGameOver(animated: true)
    }
    
    func onScoreChange(with: PlayerScore) {
        switch with.player {
        case .one:
            self.player1ScoreLabel.text = "\(with.score)"
        case .two:
            self.player2ScoreLabel.text = "\(with.score)"
        }
    }
    
    func onCardChange(withCard card: Card?, andType type: CardType) {

        switch type {
        case .current:
            self.currentCard.set(card: card)
        case .previous:
            self.previousCard.set(card: card)
        }
    }
    
    func onSnapSuccess() {
        self.setBackgroundColour(toSnapType: .snap, animated: true)
    }
    
    func onSnapUnsuccess() {
        self.setBackgroundColour(toSnapType: .noSnap, animated: true)
    }
    
    func onCardRemoved(withRemainingCards cards: [Card]) {
        if cards.count <= 1 {
            self.currentCardUnderView.isHidden = true
        }else{
            self.currentCardUnderView.isHidden = false
        }
    }
    
}

//MARK: styling methods
extension GameViewController {
    
    private func styleCards() {
        
        currentCard.frame.size = currentCardView.frame.size
        previousCard.frame.size = previousCardView.frame.size
        currentCardView.addSubview(currentCard)
        previousCardView.addSubview(previousCard)
        
        previousCard.layer.cornerRadius = Constants.Sizes.cornerRadius
        previousCard.layer.masksToBounds = true
        
        previousCardView.backgroundColor = Colours.Views.white
        previousCardView.layer.applySketchShadow()
        previousCardView.layer.cornerRadius = Constants.Sizes.cornerRadius
        previousCardView.layer.masksToBounds = false
        
        currentCard.layer.cornerRadius = Constants.Sizes.cornerRadius
        currentCard.layer.masksToBounds = true
        
        currentCardUnder.backgroundColor = Colours.Views.greyBackground
        currentCardUnder.layer.applySketchShadow()
        currentCardUnder.layer.cornerRadius = Constants.Sizes.cornerRadius
        currentCardUnder.layer.masksToBounds = false
        
        currentCardView.backgroundColor = Colours.Views.white
        currentCardView.layer.applySketchShadow()
        currentCardView.layer.cornerRadius = Constants.Sizes.cornerRadius
        currentCardView.layer.masksToBounds = false
        
        playerControllerView.backgroundColor = Colours.Views.white
        playerControllerView.layer.applySketchShadow()
        playerControllerView.layer.cornerRadius = Constants.Sizes.cornerRadius
        playerControllerView.layer.masksToBounds = false
        
    }
    
    private func styleText() {
        previousCardLabel.textColor = Colours.Text.translucent
        deckLabel.textColor = Colours.Text.translucent
        player1Label.textColor = Colours.Text.dark
        player2Label.textColor = Colours.Text.dark
        player1ScoreLabel.textColor = Colours.Text.light
        player2ScoreLabel.textColor = Colours.Text.light
    }
    
    private func setBackgroundColour(toColour colour: UIColor) {
        self.view.backgroundColor = colour
    }
    
    private func setBackgroundColour(toSnapType snapType: SnapType, animated: Bool = false) {
        switch snapType {
        case .snap:
            animated ? setBackgroundColourWithAnimation(toColour: Colours.Views.greenish) : setBackgroundColour(toColour: Colours.Views.greenish)
        case .noSnap:
            animated ? setBackgroundColourWithAnimation(toColour: Colours.Views.redish) : setBackgroundColour(toColour: Colours.Views.redish)
        case .nothing:
            animated ? setBackgroundColourWithAnimation(toColour: Colours.Views.lightBackground) : setBackgroundColour(toColour: Colours.Views.lightBackground)
        }
    }
    
    private func setBackgroundColourWithAnimation(toColour colour: UIColor) {
        let previousColour = Colours.Views.lightBackground
        UIView.animate(withDuration: 0.2, delay: 0.0, options: [.curveLinear, .allowUserInteraction], animations: {
            self.view.backgroundColor = colour
        }) { _ in
            UIView.animate(withDuration: 0.2, delay: 0.0, options: [.curveLinear, .allowUserInteraction], animations:  {
                self.view.backgroundColor = previousColour
            })
        }
    }
    
}
