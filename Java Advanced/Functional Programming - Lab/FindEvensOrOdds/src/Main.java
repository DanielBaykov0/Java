import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String option = scanner.nextLine();

        int low = input[0];
        int high = input[1];

        List<Integer> nums = new ArrayList<>();

        for (int i = low; i <= high; i++) {
            nums.add(i);
        }

        List<Integer> oddList = nums.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());

        List<Integer> evenList = nums.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        if (option.equals("odd")) {
            System.out.print(oddList.stream().map(Object::toString).collect(Collectors.joining(" ")));
        } else if (option.equals("even")) {
            System.out.println(evenList.stream().map(Object::toString).collect(Collectors.joining(" ")));
        }
    }
}