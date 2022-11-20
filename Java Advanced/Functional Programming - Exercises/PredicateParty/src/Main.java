import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());

        while (!input.equals("Party!")) {
            String[] tokens = input.split(" ");

            String command = tokens[0];
            String type = tokens[1];
            String argument = tokens[2];

            if (command.equals("Remove")) {
                list.removeIf(getInput(type, argument));
            } else if (command.equals("Double")) {
                for (int i = 0; i < list.size(); i++) {
                    String guest = list.get(i);
                    if (getInput(type, argument).test(guest)) {
                        list.add(i++, guest);
                    }
                }
            }

            input = scanner.nextLine();
        }

        if (list.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(list);
            System.out.println(String.format("%s are going to the party!", String.join(", ", list)));
        }
    }

    private static Predicate<String> getInput(String s1, String s2) {

        switch (s1) {
            case "StartsWith":
                return text -> text.startsWith(s2);
            case "EndsWith":
                return text -> text.endsWith(s2);
            case "Length":
                return text -> text.length() == Integer.parseInt(s2);
            default:
                return text -> false;
        }
    }
}