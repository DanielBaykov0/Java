import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        int count = n;

        while (count-- > 0) {
            String[] input = scanner.nextLine().split(" ");

            elements.addAll(List.of(input));
        }

        for (String s : elements) {
            System.out.print(s + " ");
        }
    }
}