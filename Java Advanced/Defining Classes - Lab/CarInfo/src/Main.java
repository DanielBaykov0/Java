import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (input.length == 1) {
                Car car = new Car(input[0]);
                list.add(car.carInfo());
            } else {
                Car car = new Car(input[0], input[1], Integer.parseInt(input[2]));
                list.add(car.carInfo());
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}