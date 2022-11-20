import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

//        Collections.reverse(arrays);

        for (int i = 0, j = arrays.size() - 1; i < j; i++) {
            arrays.add(i, arrays.remove(j));
        }

        String print = arrays.toString().replaceAll("[\\[\\],]", "");
        print = print.replaceAll("\\s+", " ");

        System.out.println(print);

    }
}