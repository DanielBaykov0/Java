import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }

            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Delete":
                    int numberToDelete = Integer.parseInt(tokens[1]);
                    nums.removeAll(Collections.singleton(numberToDelete));
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    nums.add(indexToInsert, numberToInsert);
                    break;
            }
        }

        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }
}