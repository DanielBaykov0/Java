import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Person person;
        List<Person> list = new ArrayList<>();

        int count = n;
        while (count-- > 0) {
            String[] items = scanner.nextLine().split(" ");

            person = new Person(items[0], Integer.parseInt(items[1]));
            if (person.age >= 30) {
                list.add(person);
            }
        }

        Collections.sort(list);
        list.forEach(p -> System.out.printf(p.name + " - " + p.age + "\n"));
    }
}