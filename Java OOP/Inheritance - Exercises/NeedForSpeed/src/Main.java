import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fuel = Double.parseDouble(scanner.nextLine());
        int horsePower = Integer.parseInt(scanner.nextLine());

        Vehicle vehicle = new Vehicle(fuel, horsePower);
        SportCar sportCar = new SportCar(fuel, horsePower);

        System.out.println(sportCar.getFuel());
        sportCar.drive(5);
        System.out.println(sportCar.getFuel());
    }
}