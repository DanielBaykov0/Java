import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();

        String[] tokens = line.split(" ");
        int bomb = Integer.parseInt(tokens[0]);
        int specialPower = Integer.parseInt(tokens[1]);
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == bomb) {
                nums.set(i, min);

                for (int j = 0; j < specialPower; j++) {
                    if (i - 1 - j >= 0) {
                        nums.set(i - 1 - j, min);
                    }

                    if (i + 1 + j < nums.size()) {
                        nums.set(i + 1 + j, min);
                    }
                }
            }
        }

        nums.removeIf(n -> n == min);

        for (Integer num : nums) {
            sum += num;
        }

        System.out.println(sum);
    }
}