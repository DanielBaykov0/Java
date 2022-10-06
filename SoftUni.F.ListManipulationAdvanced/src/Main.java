import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }

            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Contains":
                    int numberToCheck = Integer.parseInt(tokens[1]);
                    if (numbers.contains(numberToCheck)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }

                        System.out.println();
                        break;
                    } else if (tokens[1].equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 1) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }

                        System.out.println();
                        break;
                    }
                case "Get":
                    int sum = 0;

                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }

                    System.out.println(sum);
                    break;
                case "Filter":
                    int number = Integer.parseInt(tokens[2]);
                    if (tokens[1].equals("<")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }

                        System.out.println();
                    } else if (tokens[1].equals("<=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) <= number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }

                        System.out.println();
                    } else if (tokens[1].equals(">")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) > number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }

                        System.out.println();
                    } else if (tokens[1].equals(">=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }

                        System.out.println();
                    }

                    break;
            }
        }
    }
}












