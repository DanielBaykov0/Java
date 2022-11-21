import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String line;
        while (!(line = scanner.nextLine()).equals("END")) {
            String[] items = line.split("\\s+");

            people.add(new Person(items[0], Integer.parseInt(items[1]), items[2]));
        }

        int n = Integer.parseInt(scanner.nextLine());
        Person person = people.get(n - 1);

//        long count = people.stream()
//                .filter(p -> p.compareTo(person) == 0).count();

        int count = 0;

        for (Person p : people) {
            if (p.compareTo(person) == 0) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d",
                    count,
                    people.size() - count,
                    people.size());
        }
    }
}