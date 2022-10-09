import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        String line = sc.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String homeTown = tokens[3];

            Student student = new Student(firstName, lastName, age, homeTown);
            students.add(student);
            line = sc.nextLine();
        }

        String city = sc.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(city)) {
                System.out.printf("%s %s is %d years old\n",
                        student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }
}