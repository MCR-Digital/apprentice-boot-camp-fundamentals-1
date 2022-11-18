package cards

import java.util.*

internal class Snap(private val deck: AnimalDeck) {
    private var player1Score = 0
    private var player2Score = 0

    init {
        deck.shuffle()
    }

    fun play() {
        val scanner = Scanner(System.`in`)
        var previousCard: AnimalCard? = null
        while (deck.getCards().isNotEmpty()) {
            val currentCard = deck.deal()
            println(currentCard)
            val input = scanner.nextLine()
            if (input.isNotEmpty() && input[0] == 'a') {
                if (currentCard!!.snap(previousCard)) {
                    println("SNAP! score Player 1")
                    player1Score++
                } else {
                    println("WRONG! deducting score from Player 1")
                    player1Score--
                }
            } else if (input.isNotEmpty() && input[0] == 'l') {
                if (currentCard!!.snap(previousCard)) {
                    println("SNAP! scorePlayer 2")
                    player2Score++
                } else {
                    println("WRONG! deducting score from Player 2")
                    player2Score--
                }
            }
            previousCard = currentCard
        }
        if (player1Score == player2Score) {
            println("Draw.")
        } else if (player1Score > player2Score) {
            println("Player 1 wins!")
        } else println("Player 2 wins!")
        println("Scores: $player1Score vs $player2Score")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val snap = Snap(AnimalDeck())
            snap.play()
        }
    }
}
