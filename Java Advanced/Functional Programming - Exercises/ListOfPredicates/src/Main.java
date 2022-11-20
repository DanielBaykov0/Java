import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Integer[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        Predicate<Integer> predicate = integer -> {
            for (Integer i : nums) {
                if (i == 0) {
                    continue;
                }

                if (integer % i != 0) {
                    return false;
                }
            }

            return true;
        };

        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}