public class Deck {
    public static void main(String[] args) {

        int[][] deck = new int[52][2];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck[i*13+j] = new int[]{i, j};
            }
        }

        for (int[] card : deck) {

            String faceValue;
            switch (card[1]){
                case 0: faceValue = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValue = Integer.toString(card[1]+1); break;
                case 10: faceValue = "jack"; break;
                case 11: faceValue = "queen"; break;
                case 12: faceValue = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card[1] + "is not a valid faceValue!");
            }

            String suit;
            switch (card[0]){
                case 0: suit = "clubs"; break;
                case 1: suit = "diamonds"; break;
                case 2: suit = "hearts"; break;
                case 3: suit = "spades"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card[0] + "is not a valid suit!");
            }

            System.out.println(faceValue + " of " + suit);
        }
    }
}
