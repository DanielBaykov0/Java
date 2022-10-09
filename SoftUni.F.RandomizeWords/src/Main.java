import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] input = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i < input.length; i++) {
            int rnd = random.nextInt(input.length);

            String a = input[rnd];
            String b = input[i];

            input[rnd] = b;
            input[i] = a;
        }

        for (String item : input) {
            System.out.println(item);
        }

    }
}