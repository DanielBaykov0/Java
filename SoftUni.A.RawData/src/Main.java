import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        int count = n;
        while (count-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            String model = input[0];
            Engine engine = new Engine(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            Cargo cargo = new Cargo(Integer.parseInt(input[3]), input[4]);
            Tire tire1 = new Tire(Double.parseDouble(input[5]), Integer.parseInt(input[6]));
            Tire tire2 = new Tire(Double.parseDouble(input[7]), Integer.parseInt(input[8]));
            Tire tire3 = new Tire(Double.parseDouble(input[9]), Integer.parseInt(input[10]));
            Tire tire4 = new Tire(Double.parseDouble(input[11]), Integer.parseInt(input[12]));

            Car car = new Car(model, engine, cargo, tire1, tire2, tire3, tire4);
            carList.add(car);
        }

        String line = scanner.nextLine();
        List<String> finalText = new ArrayList<>();

        if (line.equals("fragile")) {
            carList.forEach(e -> {
                if (e.getCargo().getType().equals("fragile")) {
                    for (Tire tire : e.getTires()) {
                        if (tire.getPressure() < 1) {
                            finalText.add(e.getModel());
                            break;
                        }
                    }
                }
            });
        } else {
            carList.forEach(e -> {
                if (e.getCargo().getType().equals("flammable") && e.getEngine().getPower() > 250) {
                    finalText.add(e.getModel());
                }
            });
        }

        finalText.forEach(System.out::println);

    }
}