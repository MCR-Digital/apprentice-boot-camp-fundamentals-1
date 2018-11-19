from deck import Deck
from random import shuffle


class Snap:

    def __init__(self):
        self.player_1_score = 0
        self.player_2_score = 0
        self.deck = Deck()
        self.deck.make_deck()
        self.deck.shuffle()

    def play(self):
        previous_card = None
        while len(self.deck.cards) > 0:
            current_card = self.deck.deal()
            print(current_card.full_name)
            player_input = raw_input("Your turn: ")
            print("PLAYER INPUT: ", player_input)
            if len(player_input) > 0 and player_input[0] == 'a':
                if current_card.snap(previous_card):
                    print("SNAP! score Player 1")
                    self.player_1_score += 1
                else:
                    print("WRONG! deducting score from Player 1")
                    self.player_1_score -= 1
            elif len(player_input) > 0 and player_input[0] == 'l':
                if current_card.snap(previous_card):
                    print("SNAP! scorePlayer 2")
                    self.player_2_score += 1
                else:
                    print("WRONG! deducting score from Player 2")
                    self.player_2_score -= 1

            previous_card = current_card

        if self.player_1_score == self.player_2_score:
            print("Draw")
        elif self.player_1_score > self.player_2_score:
            print("Player 1 wins!")
        else:
            print("Player 2 wins!")

        print("Scores: {player_1_score} vs {player_2_score}".format(
            player_1_score=self.player_1_score, player_2_score=self.player_2_score))


def play_snap():
    snap = Snap()
    snap.play()


play_snap()
