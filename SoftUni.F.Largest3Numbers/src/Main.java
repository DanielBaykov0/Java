import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> nums = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        for (int num : nums) {
            System.out.print(num + " ");
        }


    }
}