import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] items = scanner.nextLine().split("\\s+");
        Deque<String> nums = new ArrayDeque<>();
        Collections.addAll(nums, items);

        while (nums.size() > 1) {
            int first = Integer.parseInt(nums.pop());
            String op = nums.pop();
            int second = Integer.parseInt(nums.pop());

            switch (op) {
                case "+":
                    nums.push(String.valueOf(first + second));
                    break;
                case "-":
                    nums.push(String.valueOf(first - second));
                    break;
            }
        }

        System.out.println(nums.pop());
    }
}