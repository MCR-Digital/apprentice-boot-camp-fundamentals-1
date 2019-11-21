//
//  SnapGame.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//

import Foundation

class SnapGame {
 
    // MARK: variables with didSet (for calling delegate methods)
    private var player1Score = 0 {
        didSet { gameDelegate?.onScoreChange(with: PlayerScore(player: .one, score: player1Score)) }
    }
    
    private var player2Score = 0 {
        didSet { gameDelegate?.onScoreChange(with: PlayerScore(player: .two, score: player2Score)) }
    }
    
    private var currentCard: Card! {
        didSet { gameDelegate?.onCardChange(withCard: currentCard, andType: .current) }
    }
    private var previousCard: Card! {
        didSet { /*gameDelegate?.onCardChange(withCard: previousCard, andType: .previous)*/ }
    }
    
    /**
        the deck which holds all of the cards for the game
     */
    private var deck: Deck
    
    /**
        set to `self` on the class you instantiate `SnapGame` on to use all the `PlayableDelegate` protocol methods
     */
    weak var gameDelegate: PlayableDelegate?
    
    init(deck: Deck) {
        self.deck = deck
        deck.shuffle()
    }
    
    init() {
        self.deck = SuperDeck()
        deck.shuffle()
    }
    
}

// MARK: game functions
extension SnapGame {
    
    /**
    calls the `play` method with the player that is passed in
     - Parameter withPlayer the player that made the move
     */
    func pressedPlayer(withPlayer player: Player) {
        play(withPlayer: player)
    }
    
    /**
     Restarts the game properties and creates a new deck
     */
    func restart() {
        player1Score = 0
        player2Score = 0
        currentCard = nil
        previousCard = nil
        deck = SuperDeck()
        deck.shuffle()
    }
    
    /**
     used when a player makes a move. It will first deal a new card for that player, and if their card matches the previous card then its a snap! otherwise is is wrong. Then the previous card gets set to the current card
     */
    private func play(withPlayer player: Player) {
        
        guard deck.getCards().count > 0 else { gameDelegate?.onEnd(withResult: calculateResult()); return }
    
        gameDelegate?.onCardChange(withCard: previousCard, andType: .previous)
        currentCard = deck.deal()
        gameDelegate?.onCardRemoved(withRemainingCards: deck.getCards())
        
        if cardsNotNil() && currentCard.snap(otherCard: previousCard) {
            gameDelegate?.onSnapSuccess()
            changeScore(forPlayer: player, with: .increment(.one))
        }else {
            gameDelegate?.onSnapUnsuccess()
            changeScore(forPlayer: player, with: .decrement(.one))
        }
        
        previousCard = currentCard
            
    }
    
    /**
     Returns true if both current and previous cards are not nil
     - Returns: returns a boolean value which is a result of checking the two cards are not nil
     */
    private func cardsNotNil() -> Bool {
        return currentCard != nil && previousCard != nil
    }
    
    /**
     compares the scores of both players and returns the result, either `Player` or `Draw`
     - Returns: the result of the calculation, of type `Result`
     */
    private func calculateResult() -> Result {
        if player1Score > player2Score {
            return Result.player(PlayerScore(player: .one, score: player1Score))
        }else if player2Score > player1Score {
            return Result.player(PlayerScore(player: .two, score: player2Score))
        }
        return Result.draw
    }
    
    /**
     changes the score for the player that is passed in, either with an increment or decrement
     - Parameter forPlayer the player to change the score of
     - Parameter with the type of score to give, either an incremenet or decrement
     */
    private func changeScore(forPlayer player: Player, with type: IncrementType) {
        switch player {
        case .one:
            player1Score += type.calculate()
        case .two:
            player2Score += type.calculate()
        }
    }
    
}

// MARK: getters
extension SnapGame {
    
    /**
     gets the score for the player which is passed in
     - Parameter player: is the player we are getting the score for
     - Returns: Returns the players score as an `Int`
     */
    public func getScore(forPlayer player: Player) -> Int {
        switch player {
        case .one:
            return player1Score
        case .two:
            return player2Score
        }
    }
    
    /**
     Gets the card for the type that is passed in
     - Parameter type:  is the type of card we are getting. There are 2 types. Current and Previous.
     - Returns: Returns the type of card as an optional `Card` (since current and previous card can be a nil value)
     */
    public func getCard(withType type: CardType) -> Card? {
        switch type {
        case .current:
            return currentCard
        case .previous:
            return previousCard
        }
    }
 
}
