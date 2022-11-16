import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();

        for (int i : nums) {
            list.add(i);
        }

        Collections.reverse(list);
        list.stream().filter(a -> a % n != 0).forEach(s -> System.out.print(s + " "));
    }
}