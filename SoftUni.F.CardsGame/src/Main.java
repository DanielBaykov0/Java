import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> player1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> player2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (player1.size() > 0 && player2.size() > 0) {
            if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            } else if (player2.get(0) > player1.get(0)) {
                player2.add(player2.get(0));
                player2.add(player1.get(0));
                player1.remove(0);
                player2.remove(0);
            } else {
                player1.remove(0);
                player2.remove(0);
            }
        }

        if (player1.size() == 0) {
            for (int i = 0; i < player2.size(); i++) {
                sum += player2.get(i);
            }

            System.out.println("Second player wins! Sum: " + sum);
        } else {
            for (int i = 0; i < player1.size(); i++) {
                sum += player1.get(i);
            }

            System.out.println("First player wins! Sum: " + sum);
        }
    }
}