import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<BoxOfIntegers<Integer>> list = new ArrayList<>();

        while (n-- > 0) {
            int m = Integer.parseInt(scanner.nextLine());

            list.add(new BoxOfIntegers<>(m));
        }

        list.forEach(System.out::println);
    }
}