import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String line = sc.nextLine();

        List<Person> people = new ArrayList<>();

        while (!line.equals("End")) {
            String[] input = line.split(" ");

            Person person = new Person(input[0], input[1], Integer.parseInt(input[2]));
            people.add(person);

            line = sc.nextLine();
        }

        people.sort(Comparator.comparing(Person::getAge));

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}