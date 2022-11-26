import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Vehicle> vehiclesList = new LinkedList<>();
        fillVehicle(reader, vehiclesList);

        int commandsAmount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < commandsAmount; i++) {
            String[] commandTokens = reader.readLine().split("\\s+");
            executeCommand(vehiclesList, commandTokens);
        }

        vehiclesList.forEach(System.out::println);
    }

    private static void fillVehicle(BufferedReader reader, List<Vehicle> vehiclesList) throws IOException {
        for (int i = 0; i < 3; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            double fuelQuantity = Double.parseDouble(tokens[1]);
            double litersPerKm = Double.parseDouble(tokens[2]);
            double tankCapacity = Double.parseDouble(tokens[3]);

            switch (tokens[0]) {
                case "Car":
                    vehiclesList.add(new Car(fuelQuantity, litersPerKm, tankCapacity));
                    break;
                case "Truck":
                    vehiclesList.add(new Truck(fuelQuantity, litersPerKm, tankCapacity));
                    break;
                case "Bus":
                    vehiclesList.add(new Bus(fuelQuantity, litersPerKm, tankCapacity));
                    break;
            }
        }
    }

    private static void executeCommand(List<Vehicle> vehiclesList, String[] commandTokens) {
        String command = commandTokens[0];
        String vehicleType = commandTokens[1];
        double amount = Double.parseDouble(commandTokens[2]);

        try {
            switch (command) {
                case "Drive":
                    driveVehicle(vehiclesList, vehicleType, amount);
                    break;
                case "DriveEmpty":
                    driveEmptyVehicle(vehiclesList, amount);
                    break;
                case "Refuel":
                    refuelVehicle(vehiclesList, vehicleType, amount);
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void refuelVehicle(List<Vehicle> vehiclesList, String vehicleType, double amount) {
        for (Vehicle vehicle : vehiclesList) {
            if (vehicle.getClass().getSimpleName().equals(vehicleType)) {
                vehicle.refuel(amount);
            }
        }
    }

    private static void driveVehicle(List<Vehicle> vehiclesList, String vehicleType, double amount) {
        for (Vehicle vehicle : vehiclesList) {
            if (vehicle.getClass().getSimpleName().equals(vehicleType)) {
                System.out.println(vehicle.drive(amount));
            }
        }
    }

    private static void driveEmptyVehicle(List<Vehicle> vehiclesList, double amount) {
        for (Vehicle vehicle : vehiclesList) {
            if (vehicle.getClass().getSimpleName().equals("Bus")) {
                System.out.println(vehicle.drive(amount));
            }
        }
    }
}