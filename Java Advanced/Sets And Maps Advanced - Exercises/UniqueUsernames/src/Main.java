import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set = new LinkedHashSet<>();

        int count = n;

        while (count-- > 0) {
            String username = scanner.nextLine();

            set.add(username);
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}