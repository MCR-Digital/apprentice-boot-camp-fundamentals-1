class Encapsulation:
    def __init__(self):
        pass

    def runner(self):
        encapsulation = Encapsulation()
        deck_in_order = encapsulation.getCards()
        for card in deck_in_order:
            print(card)

    def get_cards(self):
        result = [None] * 52
        deck = []
        suits = range(0, 4)
        face_values = range(0, 13)
        for suit in suits:
            for num in face_values:
                deck.append([suit, num])

        card_number = 0

        for card in deck:
            if card[1] == 0:
                face_value_name = "ace"
            elif card[1] in range(0, 10):
                face_value_name = str(card[1] + 1)
            elif card[1] == 10:
                face_value_name = "jack"
            elif card[1] == 11:
                face_value_name = "queen"
            elif card[1] == 12:
                face_value_name = "king"
                # default: throw new IllegalArgumentException("Something went wrong " + card[1] + "is not a valid faceValue!");}

            if card[0] == 0:
                suit_name = "clubs"
            elif card[0] == 1:
                suit_name = "diamonds"
            elif card[0] == 2:
                suit_name = "hearts"
            elif card[0] == 3:
                suit_name = "spades"
                # default: throw new IllegalArgumentException("Something went wrong " + card[0] + "is not a valid suit_name!");
            result[card_number] = face_value_name + " of " + suit_name
            card_number += 1

        return result
