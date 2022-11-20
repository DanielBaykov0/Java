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

            if (Student.isStudentExisting(students, firstName, lastName)) {
                Student student = Student.getStudent(students, firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);
            } else {
                Student student = new Student(firstName, lastName, age, homeTown);
                students.add(student);
            }

//            Student student = students.stream().filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName))
//                    .findFirst().orElse(null);
//
//            if (student == null) {
//                Student studentToAdd = new Student(firstName, lastName, age, homeTown);
//                students.add(studentToAdd);
//            } else {
//                student.setFirstName(firstName);
//                student.setLastName(lastName);
//                student.setAge(age);
//                student.setHomeTown(homeTown);
//            }

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