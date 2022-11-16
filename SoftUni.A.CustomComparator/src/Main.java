import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        result.addAll(sortEven(list));
        result.addAll(sortOdd(list));

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static List<Integer> sortEven(List<Integer> list) {

        return list.stream().filter(a -> a % 2 == 0).sorted().collect(Collectors.toList());
    }

    private static List<Integer> sortOdd(List<Integer> list) {

        return list.stream().filter(a -> (a % 2 == 1) || (a % 2 == -1)).sorted().collect(Collectors.toList());
    }
}