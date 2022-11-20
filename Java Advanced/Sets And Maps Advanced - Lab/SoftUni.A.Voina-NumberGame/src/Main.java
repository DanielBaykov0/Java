import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] second = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        List<Integer> firstPlayerCards = new ArrayList<>();

        for (int n : first) {
            firstPlayerCards.add(n);
        }

        List<Integer> secondPlayerCards = new ArrayList<>();

        for (int n : second) {
            secondPlayerCards.add(n);
        }

        int firstNumber = firstPlayerCards.iterator().next();
        firstPlayerCards.remove(firstNumber);

        int secondNumber = secondPlayerCards.iterator().next();
        secondPlayerCards.remove(secondNumber);

        if (firstNumber > secondNumber) {
            firstPlayerCards.add(firstNumber);
            firstPlayerCards.add(secondNumber);
        } else if (secondNumber > firstNumber) {
            secondPlayerCards.add(firstNumber);
            secondPlayerCards.add(secondNumber);
        }

        if (firstPlayerCards.isEmpty()) {
            System.out.println("Second player win!");
        } else if (secondPlayerCards.isEmpty()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw");
        }

    }
}