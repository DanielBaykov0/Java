import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");

            Person person = new Person(line[0], Integer.parseInt(line[1]));

            if (person.getAge() > 30 ) {
                System.out.println(person);
            }
        }
    }
}