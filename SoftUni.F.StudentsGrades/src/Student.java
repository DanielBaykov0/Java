public class Student {

    private String firstName;
    private String lastName;
    private float grade;

    public Student(String firstName, String lastName, float grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public  float getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",
                this.firstName, this.lastName, this.grade);
    }
}
