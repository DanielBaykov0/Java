public class Card {

    CardRank cardName;
    CardSuit suitName;

    public Card(CardRank cardName, CardSuit suitName) {
        this.cardName = cardName;
        this.suitName = suitName;
    }

    public static int calculate(CardRank cardRank, CardSuit cardSuit) {

        return calcRank(cardRank) + calcSuit(cardSuit);
    }

    private static int calcRank(CardRank cardRank) {
        int sum = 0;
        switch (cardRank) {
            case ACE:
                sum = 14;
                break;
            case TWO:
                sum = 2;
                break;
            case THREE:
                sum = 3;
                break;
            case FOUR:
                sum = 4;
                break;
            case FIVE:
                sum = 5;
                break;
            case SIX:
                sum = 6;
                break;
            case SEVEN:
                sum = 7;
                break;
            case EIGHT:
                sum = 8;
                break;
            case NINE:
                sum = 9;
                break;
            case TEN:
                sum = 10;
                break;
            case JACK:
                sum = 11;
                break;
            case QUEEN:
                sum = 12;
                break;
            case KING:
                sum = 13;
                break;
        }

        return sum;
    }

    private static int calcSuit(CardSuit cardSuit) {
        int sum = 0;
        switch (cardSuit) {
            case CLUBS:
                sum = 0;
                break;
            case DIAMONDS:
                sum = 13;
                break;
            case HEARTS:
                sum = 26;
                break;
            case SPADES:
                sum = 39;
                break;
        }

        return sum;
    }
}
