import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> function = a -> Arrays.stream(a).min().getAsInt();

        System.out.println(function.apply(nums));
    }
}