import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Consumer<List<String>> consumer = list -> list.forEach(System.out::println);

        List<String> list = new ArrayList<>();

        for (String s : input) {
            list.add(s);
        }

        consumer.accept(list);
    }
}