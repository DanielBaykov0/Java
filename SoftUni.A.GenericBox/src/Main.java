import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Box<String>> list = new ArrayList<>();

        while (n-- > 0) {
            String line = scanner.nextLine();

            Box<String> box = new Box<>(line);
            list.add(box);
        }

        list.forEach(System.out::println);
    }
}