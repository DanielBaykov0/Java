import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Consumer<List<String>> names = list -> list.forEach(a -> System.out.println("Sir " + a));

        List<String> list = new ArrayList<>(Arrays.asList(input));

        names.accept(list);
    }
}