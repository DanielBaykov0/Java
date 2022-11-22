import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(sum(nums, nums.length));
    }

    private static int sum(int[] nums, int index) {
        if (index <= 0) {
            return 0;
        }

        return (sum(nums, index - 1) + nums[index - 1]);
    }
}