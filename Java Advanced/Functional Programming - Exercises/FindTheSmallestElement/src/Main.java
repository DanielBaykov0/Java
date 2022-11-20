import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <input.size(); i++) {
            int current = input.get(i);

            if (current < min) {
                min = current;
            }
        }

        System.out.println(input.indexOf(min));
    }
}