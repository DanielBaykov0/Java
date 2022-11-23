public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private int percentage;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void increaseSalary(double percentage) {
        if (this.age < 30) {
            this.salary = this.salary + (this.salary * percentage / 200);
        } else {
            this.salary = this.salary + (this.salary * percentage / 100);
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " gets " + salary + " leva";
    }
}
