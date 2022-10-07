import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacityOfEachWagon = Integer.parseInt(scanner.nextLine());

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }

            String[] tokens = line.split(" ");

            if (tokens[0].equals("Add")) {
                int numberToAdd = Integer.parseInt(tokens[1]);
                wagons.add(numberToAdd);
            } else {
                int passengerToAdd = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int passengers = wagons.get(i);
                    if (passengerToAdd + passengers <= maxCapacityOfEachWagon) {
                        wagons.add(i, passengers + passengerToAdd);
                        wagons.remove(i + 1);
                        break;
                    }
                }
            }
        }

        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}