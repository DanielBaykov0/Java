import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Person> personSet = new TreeSet<>();
        Set<Person> personHashSet = new HashSet<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] items = scanner.nextLine().split("\\s+");

            personSet.add(new Person(items[0], Integer.parseInt(items[1])));
            personHashSet.add(new Person(items[0], Integer.parseInt(items[1])));
        }

        System.out.println(personSet.size());
        System.out.println(personHashSet.size());
    }
}