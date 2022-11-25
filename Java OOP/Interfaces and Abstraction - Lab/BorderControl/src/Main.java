import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        String line;
        while (!(line = scanner.nextLine()).equals("End")) {
            String[] items = line.split(" ");

            switch (items.length) {
                case 3:
                    String name = items[0];
                    int age = Integer.parseInt(items[1]);
                    String id = items[2];
                    identifiables.add(new Citizen(name, age, id));
                    break;
                case 2:
                    String model = items[0];
                    String robotId = items[1];
                    identifiables.add(new Robot(model, robotId));
                    break;
            }
        }

        String nums = scanner.nextLine();

        identifiables.removeIf(identifiable -> !identifiable.getId().endsWith(nums));

        identifiables.forEach(identifiable -> System.out.println(identifiable.getId()));

//        citizens.removeIf(citizen -> !citizen.getId().endsWith(nums));
//        robots.removeIf(robot -> !robot.getId().endsWith(nums));

//        for (Citizen citizen : citizens) {
//            System.out.println(citizen.getId());
//        }
//
//        for (Robot robot : robots) {
//            System.out.println(robot.getId());
//        }
    }
}