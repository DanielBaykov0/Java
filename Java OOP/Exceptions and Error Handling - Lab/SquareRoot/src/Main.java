import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(squareRoot(Double.parseDouble(scanner.nextLine())));
        } catch (Exception e) {
            System.out.println("Invalid number");
        } finally {
            System.out.println("Goodbye");
        }
    }

    public static double squareRoot(double value) {
        if (value < 0) {
            throw new ArithmeticException("Invalid number");
        }

        return Math.sqrt(value);
    }
}