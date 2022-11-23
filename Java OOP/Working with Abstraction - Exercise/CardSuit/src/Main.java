import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");

        for (CardSuit cardSuit : CardSuit.values()) {
            System.out.println("Original value: " + cardSuit.ordinal() + "; Name value: " + cardSuit);
        }

        System.out.println("Card Ranks:");

        for (CardRank cardRank : CardRank.values()) {
            System.out.println("Original value: " + cardRank.ordinal() + "; Name value: " + cardRank);
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        CardRank cardName = CardRank.valueOf(scanner.nextLine());
        CardSuit suitName = CardSuit.valueOf(scanner.nextLine());

        Card card = new Card(cardName, suitName);

        System.out.println("Card name: " + cardName + " of " + suitName + "; Card power: " + Card.calculate(cardName, suitName));
    }
}