import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, ArrayList<Double>> studentRecord = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            studentRecord.putIfAbsent(input[0], new ArrayList<>());
            studentRecord.get(input[0]).add(Double.parseDouble(input[1]));
        }

        studentRecord.entrySet().forEach(entry -> {
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(innerEntry -> System.out.printf("%.2f ", innerEntry));
            System.out.printf("(avg: %.2f)%n", entry.getValue().stream().mapToDouble(e -> e).average().getAsDouble());
        });

    }
}