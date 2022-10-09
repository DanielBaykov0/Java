import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> strings = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List<String> newStrings = new ArrayList<>();

        String line = scanner.nextLine();

        String[] tokens = line.split(" ");

        while (!line.equals("3:1")) {
            switch (tokens[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);

                    if (startIndex < 0) {
                        startIndex = 0;
                    }

                    if (endIndex > strings.size() - 1) {
                        endIndex = strings.size() - 1;
                    }

                    for (int i = startIndex; i < endIndex; i++) {
                        String concat = strings.get(startIndex) + strings.get(startIndex + 1);
                        strings.set(startIndex, concat);
                        strings.remove(startIndex +1);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(tokens[1]);
                    int partitions = Integer.parseInt(tokens[2]);

                    if (index >= 0 && index < strings.size() && partitions >= 0 && partitions <= 100) {
                        String element = strings.get(index);

                        if (element.length() % partitions == 0) {
                            int portionLength = element.length() / partitions;
                            int count = 0;

                            for (int i = 0; i < partitions; i++) {
                                String concat = "";
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }

                                newStrings.add(concat);
                            }
                        } else {
                            int portionLength = element.length() / partitions;
                            int count = 0;

                            for (int i = 0; i < partitions; i++) {
                                String concat = "";

                                if (i == partitions - 1) {
                                    for (int j = count; j < element.length(); j++) {
                                        char symbol = element.charAt(count);
                                        concat += symbol;
                                        count++;
                                    }
                                } else {
                                    for (int j = 0; j < portionLength; j++) {
                                        char symbol = element.charAt(count);
                                        concat += symbol;
                                        count++;
                                    }
                                }

                                newStrings.add(concat);
                            }
                        }

                        strings.remove(index);
                        strings.addAll(index, newStrings);
                    }

                    break;
            }

            line = scanner.nextLine();
        }

        for (String item : strings) {
            System.out.print(item + " ");
        }
    }
}