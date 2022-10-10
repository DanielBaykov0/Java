import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(sc.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            Student student = new Student(tokens[0], tokens[1], Float.parseFloat(tokens[2]));
            students.add(student);
        }

        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}