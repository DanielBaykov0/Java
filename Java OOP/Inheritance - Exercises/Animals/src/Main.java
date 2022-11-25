import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Animal> animals = new ArrayList<>();

        while (!input.equals("Beast!")) {

            String[] tokens = scanner.nextLine().split("\\s+");

            Animal animal;
            try {
                switch (input) {
                    case "Dog":
                        animal = new Dog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        break;
                    case "Cat":
                        animal = new Cat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        break;
                    case "Frog":
                        animal = new Frog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        break;
                    case "Kittens":
                        animal = new Kitten(tokens[0], Integer.parseInt(tokens[1]));
                        break;
                    default:
                        animal = new Tomcat(tokens[0], Integer.parseInt(tokens[1]));
                        break;
                }
                animals.add(animal);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}