import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Engine> engineList = new ArrayList<>();

        while (n-- > 0) {
            String[] items = scanner.nextLine().split(" ");
            Engine engine = new Engine(items[0], Integer.parseInt(items[1]));

            switch (items.length) {
                case 4:
                    engine.setDisplacement(items[2]);
                    engine.setEfficiency(items[3]);
                    break;
                case 3:
                    if (Character.isLetter(Integer.parseInt(items[2]))) {
                        engine.setEfficiency(items[2]);
                    } else {
                        engine.setDisplacement(items[2]);
                    }
                    break;
            }

            engineList.add(engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new ArrayList<>();

        while (m-- > 0) {
            String[] items = scanner.nextLine().split(" ");
            String model = items[0];
            String engineName = items[1];
            Engine engine = null;
            for (Engine engine1 : engineList) {
                if (engine1.getModel().equals(engineName)) {
                    engine = engine1;
                    break;
                }
            }

            Car car = new Car(model, engine);

            switch (items.length) {
                case 4:
                    car.setWeight(items[2]);
                    car.setColor(items[3]);
                    break;
                case 3:
                    if ((items[2]).matches("[0-9]+")) {
                        car.setWeight(items[2]);
                    } else {
                        car.setColor(items[2]);
                    }
                    break;
            }
            carList.add(car);
        }

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}