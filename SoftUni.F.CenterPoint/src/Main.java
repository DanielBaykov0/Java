import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        closestPoint(x1, y1, x2, y2);

    }

    public static void closestPoint(double x1, double y1, double x2, double y2) {

        double firstPoint = Math.sqrt(Math.pow(y1, 2) + Math.pow(x1, 2));
        double secondPoint = Math.sqrt(Math.pow(y2, 2) + Math.pow(x2, 2));

        if (firstPoint < secondPoint) {
            System.out.printf("(%.0f, %.0f)", x1, y1);
        } else {
            System.out.printf("(%.0f, %.0f)", x2, y2);
        }
    }
}