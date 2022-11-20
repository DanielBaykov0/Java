import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char ch = ' ';
        int count = 0;

        String[] substring = input.split("[^A-Z]+");

        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

    }

    private static long countWordsUsingPredicate(String string, Predicate<String> predicate) {
        Objects.requireNonNull(string);

        return Stream.of(string.split("\\s"))
                .filter(predicate).count();
    }
}