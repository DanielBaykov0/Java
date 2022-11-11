import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split(", ");

        while (!input[0].equals("END")) {
            String direction = input[0];
            String carNumber = input[1];

            if (direction.equals("IN")) {
                map.put(carNumber, direction);
            } else {
                if (direction.equals("OUT")) {
                    map.remove(carNumber);
                }
            }

            input = scanner.nextLine().split(", ");

            if (map.isEmpty()) {
                System.out.println("Parking Lot is Empty");
            }
        }

        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }
}