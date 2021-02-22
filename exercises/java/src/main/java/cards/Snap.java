package cards;

import java.util.Scanner;

class Snap {
    private int player1Score;
    private int player2Score;
    private AnimalDeck deck;

    Snap(AnimalDeck deck) {
        this.deck = deck;
        deck.shuffle();
    }

    public static void main(String[] args) {
        printUsageInformation();
        Snap snap = new Snap(new AnimalDeck());
        snap.play();
    }

    private static void printUsageInformation() {
        System.out.println();
        System.out.println("Welcome to the game of snap.");
        System.out.println("The game will display a card.");
        System.out.println("Pressing ENTER will display the next card.");
        System.out.println("If the new card matches the previous one then it's a snap.");
        System.out.println("To call a snap, player 1 presses the 'a' key,");
        System.out.println("player 2 presses the 'l' key.");
        System.out.println("Hope that's clear, good luck!");
        System.out.println();
    }

    void play() {
        Scanner scanner = new Scanner(System.in);

        AnimalCard previousCard = null;
        while (deck.getCards().length > 0) {
            AnimalCard currentCard = deck.deal();
            System.out.println(currentCard);
            String input = scanner.nextLine();
            if (input.length() > 0 && input.charAt(0) == 'a') {
                if (currentCard.snap(previousCard)) {
                    System.out.println("SNAP! score Player 1");
                    player1Score++;
                } else {
                    System.out.println("WRONG! deducting score from Player 1");
                    player1Score--;
                }
            } else if (input.length() > 0 && input.charAt(0) == 'l') {
                if (currentCard.snap(previousCard)) {
                    System.out.println("SNAP! scorePlayer 2");
                    player2Score++;
                } else {
                    System.out.println("WRONG! deducting score from Player 2");
                    player2Score--;
                }
            }
            previousCard = currentCard;
        }

        if (player1Score == player2Score) {
            System.out.println("Draw.");
        } else if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else System.out.println("Player 2 wins!");

        System.out.println("Scores: " + player1Score + " vs " + player2Score);
    }
}
