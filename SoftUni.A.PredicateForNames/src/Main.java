import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split(" ");

        Predicate<String> predicate = s -> s.length() <= n;

        for (String s : input) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}