import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> people = new ArrayList<>();

        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandsCount; i++) {

            String line = scanner.nextLine();
            String[] tokens = line.split(" ");

            if (line.equals(tokens[0] + " is going!")) {
                if (people.contains(tokens[0])) {
                    System.out.println(tokens[0] + " is already in the list!");
                } else {
                    people.add(tokens[0]);
                }
            }

            if (line.equals(tokens[0] + " is not going!")) {
                if (people.contains(tokens[0])) {
                    people.remove(tokens[0]);
                } else {
                    System.out.println(tokens[0] + " is not in the list!");
                }
            }
        }

        System.out.println(people.toString().replaceAll("[\\[\\],]", ""));
    }
}