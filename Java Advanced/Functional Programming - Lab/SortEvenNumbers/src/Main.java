import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int[] nums = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        for (int n : nums) {
            list.add(n);
        }

        list.removeIf(num -> num % 2 != 0);

        for (int n : list) {
            System.out.print(n + " ");
        }
        System.out.println();

        list.sort(Integer::compareTo);

        for (int n : list) {
            System.out.print(n + " ");
        }
    }
}