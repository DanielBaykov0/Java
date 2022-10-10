import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String line = sc.nextLine();

        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

        int carCount = 0;
        int carHorsepower = 0;
        int truckCount = 0;
        int truckHorsepower = 0;

        while (!line.equals("End")) {
            String[] input = line.split(" ");

            Vehicle vehicle = new Vehicle(input[0], input[1], input[2], Integer.parseInt(input[3]));

            if (vehicle.getTypeOfVehicle().equals("car")) {
                cars.add(vehicle);
                carCount++;
                carHorsepower += Integer.parseInt(input[3]);
            } else if (vehicle.getTypeOfVehicle().equals("truck")) {
                trucks.add(vehicle);
                truckCount++;
                truckHorsepower += Integer.parseInt(input[3]);
            }

            line = sc.nextLine();
        }

        line = sc.nextLine();

        while (!line.equals("Close the Catalogue")) {
            String model = line;

            for (Vehicle truck : trucks) {
                if (model.equals(truck.getModelOfVehicle())) {
                    System.out.println(truck);
                }
            }

            for (Vehicle car : cars) {
                if (model.equals(car.getModelOfVehicle())) {
                    System.out.println(car);
                }
            }

            line = sc.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f", (carHorsepower / (double) carCount));
        System.out.println();
        System.out.printf("Trucks have average horsepower of: %.2f", (truckHorsepower / (double) truckCount));
    }
}