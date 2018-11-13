package bootcamp;

import java.util.Scanner;

class Snap {
    private int player1Score;
    private int player2Score;

    public static void main(String[] args) {
        Snap snap = new Snap();
        AnimalDeck deck = new AnimalDeck();
        deck.shuffle();
        AnimalCard previousCard = null;
        Scanner scanner = new Scanner(System.in);

        while (deck.getCards().length > 0) {
            AnimalCard currentCard = deck.deal();
            System.out.println(currentCard);
            String input = scanner.nextLine();
            if (input.length() > 0 && input.charAt(0) == 'a') {
                if (currentCard.snap(previousCard)) {
                    System.out.println("SNAP! score Player 1");
                    snap.player1Score++;
                } else {
                    System.out.println("WRONG! deducting score from Player 1");
                    snap.player1Score--;
                }
            } else if (input.length() > 0 && input.charAt(0) == 'l') {
                if (currentCard.snap(previousCard)) {
                    System.out.println("SNAP! scorePlayer 2");
                    snap.player2Score++;
                } else {
                    System.out.println("WRONG! deducting score from Player 2");
                    snap.player2Score--;
                }
            }
            previousCard = currentCard;
        }

        if (snap.player1Score == snap.player2Score) {
            System.out.println("Draw.");
        } else if (snap.player1Score > snap.player2Score) {
            System.out.println("Player 1 wins!");
        } else System.out.println("Player 2 wins!");

        System.out.println("Scores: " + snap.player1Score + " vs " + snap.player2Score);
    }
}
