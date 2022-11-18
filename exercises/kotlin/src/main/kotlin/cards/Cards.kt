package cards

class Cards {
    val cards: MutableList<String>
        get() {
            val result = MutableList(52) {""}
            val deck = Array(52) { IntArray(2) }
            for (suit in 0..3) {
                for (faceValue in 0..12) {
                    deck[suit * 13 + faceValue] = intArrayOf(suit, faceValue)
                }
            }
            for ((cardNumber, card) in deck.withIndex()) {
                val faceValueName: String = when (card[1]) {
                    0 -> "ace"
                    1, 2, 3, 4, 5, 6, 7, 8, 9 -> (card[1] + 1).toString()
                    10 -> "jack"
                    11 -> "queen"
                    12 -> "king"
                    else -> throw IllegalArgumentException("Something went wrong " + card[1] + "is not a valid faceValue!")
                }
                val suitName: String = when (card[0]) {
                    0 -> "clubs"
                    1 -> "diamonds"
                    2 -> "hearts"
                    3 -> "spades"
                    else -> throw IllegalArgumentException("Something went wrong " + card[0] + "is not a valid suitName!")
                }
                result[cardNumber] = "$faceValueName of $suitName"
            }
            return result
        }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val cards = Cards()
            val deckInOrder = cards.cards
            for (card in deckInOrder) {
                println(card)
            }
        }
    }
}