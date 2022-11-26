import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Citizen> people = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();
        List<Pet> pets = new ArrayList<>();

        String line;
        while (!(line = scanner.nextLine()).equals("End")) {
            String[] items = line.split(" ");

            switch (items[0]) {
                case "Citizen":
                    people.add(personInformation(items));
                    break;
                case "Robot":
                    robots.add(robotInformation(items));
                    break;
                case "Pet":
                    pets.add(petInformation(items));
                    break;
            }
        }

        String year = scanner.nextLine();
        people.stream().filter(citizen -> citizen.getBirthDate().endsWith(year)).forEach(citizen -> System.out.println(citizen.getBirthDate()));
        pets.stream().filter(pet -> pet.getBirthDate().endsWith(year)).forEach(pet -> System.out.println(pet.getBirthDate()));


    }

    private static Citizen personInformation(String[] items) {
        String name = items[1];
        int age = Integer.parseInt(items[2]);
        String id = items[3];
        String birthDate = items[4];

        return new Citizen(name, age, id, birthDate);
    }

    private static Robot robotInformation(String[] items) {
        String model = items[1];
        String id = items[2];

        return new Robot(model, id);
    }

    private static Pet petInformation(String[] items) {
        String name = items[1];
        String birthDate = items[2];

        return new Pet(name, birthDate);
    }
}