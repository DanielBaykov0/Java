import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lake lake = null;

        String line;
        while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
            int[] numbers = Arrays.stream(line.split(",\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            lake = new Lake(numbers);
        }

        lake.forEach(e -> {
            if (e % 2 == 1) {
                System.out.print(e + ", ");
            }

            if (e % 2 == 0) {
                System.out.print(e + ", ");
            }

        });
        System.out.print("\b");
        System.out.print("\b");
    }
}