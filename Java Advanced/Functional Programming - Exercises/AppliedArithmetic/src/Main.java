import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        boolean breakLoop = false;

        while (!breakLoop) {
            String op = scanner.nextLine();

            switch (op) {
                case "add":
                    nums = Arrays.stream(nums).map(a -> a + 1).toArray();
                    break;
                case "multiply":
                    nums = Arrays.stream(nums).map(a -> a * 2).toArray();
                    break;
                case "subtract":
                    nums = Arrays.stream(nums).map(a -> a - 1).toArray();
                    break;
                case "print":
                    System.out.println();
                    for (int i : nums) {
                        System.out.print(i + " ");
                    }
                    break;
                case "end":
                    breakLoop = true;
                    break;
            }
        }
    }
}