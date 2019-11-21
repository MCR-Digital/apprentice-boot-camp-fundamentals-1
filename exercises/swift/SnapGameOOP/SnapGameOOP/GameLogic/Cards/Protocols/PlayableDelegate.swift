//
//  playable.swift
//  SnapGameOOP
//
//  Created by Andrew Harris on 19/11/2019.
//  Copyright © 2019 Andrew Harris. All rights reserved.
//

import Foundation

protocol PlayableDelegate: class {
    /**
     called when the game ends
     - Parameter result: holds the result of the game
     */
    func onEnd(withResult result: Result)
    /**
     called when a score in the game changes
     - Parameter with: holds the score that changed and the player attached to it
     */
    func onScoreChange(with: PlayerScore)
    /**
     called when a card is changed in the pack. It can be either changed on the current or previous card
     - Parameter card: holds the new card
     - Parameter type: holds the type of card that changed. This can either be current or previous
     
     */
    func onCardChange(withCard card: Card?, andType type: CardType)
    /**
     called when a snap is made (snap returns true)
     */
    func onSnapSuccess()
    /**
     called when a comparison is made on the two cards and they do not match (snap returns false)
     */
    func onSnapUnsuccess()
    /**
     called when a card is removed from the deck (a card is delt)
     - Parameter cards: holds the remaining cards in the deck after the card was removed
     */
    func onCardRemoved(withRemainingCards cards: [Card])
}
