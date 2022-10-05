import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
}