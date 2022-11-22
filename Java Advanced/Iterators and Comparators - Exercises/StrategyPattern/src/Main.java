import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Person> p1 = new TreeSet<>(new NameComparator());
        Set<Person> p2 = new TreeSet<>(new AgeComparator());

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] items = scanner.nextLine().split("\\s+");

            p1.add(new Person(items[0], Integer.parseInt(items[1])));
            p2.add(new Person(items[0], Integer.parseInt(items[1])));
        }

        p1.forEach(System.out::println);
        p2.forEach(System.out::println);
    }
}