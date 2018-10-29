public class Encapsulation {
    public static void main(String[] args) {
        for(String card: getDeckInOrder()){
            System.out.println(card);
        }
    }

    static String[] getDeckInOrder() {
        String[] result = new String[52];
        int[][] deck = new int[52][2];

        for (int suit = 0; suit < 4; suit++) {
            for (int j = 0; j < 13; j++) {
                deck[suit*13+j] = new int[]{suit, j};
            }
        }

        int cardNumber = 0;
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

            String suitName;
            switch (card[0]){
                case 0: suitName = "clubs"; break;
                case 1: suitName = "diamonds"; break;
                case 2: suitName = "hearts"; break;
                case 3: suitName = "spades"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card[0] + "is not a valid suitName!");
            }

            result[cardNumber] = faceValue + " of " + suitName;
            cardNumber++;
        }

        return result;
    }
}
