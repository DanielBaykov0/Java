import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Rectangle rectangle = new Rectangle(nums[0], nums[1], nums[2], nums[3]);
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            int[] items = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            Point point = new Point(items[0], items[1]);
            System.out.println(rectangle.contains(point));
        }
    }
}