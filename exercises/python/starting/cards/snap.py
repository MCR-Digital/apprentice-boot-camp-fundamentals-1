from animal_deck import AnimalDeck


class Snap:

    def __init__(self, deck):
        self.player_1_score = None
        self.player_2_score = None
        self.deck = deck
        deck.shuffle()

    # def main_method(self):
    #     snap = Snap(AnimalDeck())
    #     snap.play()

    def play(self):
        previous_card = None
        while len(self.deck.cards) > 0:
            current_card = self.deck.deal()
            player_input = str(input("Your turn: "))
            if len(player_input) > 0 and player_input[0] == 'a':
                if current_card.snap(previous_card):
                    print("SNAP! score Player 1")
                    player_1_score += 1
                else:
                    print("WRONG! deducting score from Player 1")
                    player_1_score -= 1
            elif len(player_input) > 0 and player_input[0] == 'l':
                if current_card.snap(previous_card):
                    print("SNAP! scorePlayer 2")
                    player_2_score += 1
                else:
                    print("WRONG! deducting score from Player 2")
                    player2Score -= 1

            previous_card = current_card

        if player_1_score == player_2_score:
            print("Draw")
        elif player_1_score > player_2_score:
            print("Player 1 wins!")
        else:
            print("Player 2 wins!")

        print("Scores: " + player_1_score + " vs " + player_2_score)


def play_snap():
    snap = Snap(AnimalDeck())
    snap.play()


play_snap()
