import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Car> carList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int count = n;
        while (count-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            carList.add(new Car(input[0], Double.parseDouble(input[1]), Double.parseDouble(input[2])));
        }

        String line;
        while (!(line = scanner.nextLine()).equals("End")) {
            String[] input = line.split(" ");
            tryToDrive(input);
        }

        carList.forEach(System.out::println);
    }

    private static void tryToDrive(String[] input) {
        String currentModel = input[1];
        int wantedDistance = Integer.parseInt(input[2]);
        for (Car car : carList) {
            if (car.getModel().equals(currentModel)) {
                car.moveCar(wantedDistance);
            }
        }
    }
}