import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(sc.nextLine());

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");

            Employee employee = new Employee();
            employee.setName(line[0]);
            employee.setSalary(Double.parseDouble(line[1]));
            employee.setPosition(line[2]);
            employee.setDepartment(line[3]);

            switch (line.length) {
                case 5:
                    if (line[4].contains("@")) {
                        employee.setEmail(line[4]);
                    } else {
                        employee.setAge(Integer.parseInt(line[4]));
                    }
                    break;
                case 6:
                    if (line[4].contains("@")) {
                        employee.setEmail(line[4]);
                        employee.setAge(Integer.parseInt(line[5]));
                    } else {
                        employee.setAge(Integer.parseInt(line[4]));
                        employee.setEmail(line[5]);
                    }
                    break;
            }

            employees.add(employee);
        }

        List<String> departmentList = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());

        List<Department> departments = new ArrayList<>();

        for (String department : departmentList) {
            departments.add(new Department(department, employees.stream().filter(employee -> employee.getDepartment().equals(department)).collect(Collectors.toList())));
        }

        departments.sort(Comparator.comparing(Department::getAvgSalary).reversed());
        Department department = departments.get(0);
        department.getEmployee().sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.println("Highest Average Salary: " + department.getName());
        for (Employee employee : department.getEmployee()) {
            System.out.println(employee.toString());
        }
    }
}