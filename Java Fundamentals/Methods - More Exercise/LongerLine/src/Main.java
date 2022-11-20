import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        Longer(x1, y1, x2, y2, x3, y3, x4, y4);

    }

    public static void Closer(double x, double y, double z, double t) {

        if (x * x + y * y <= z * z + t * t) {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x, y, z, t);
        } else {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", z, t, x, y);
        }
    }

    public static void Longer(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {

        double z1 = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        double z2 = Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2);

        if (z1 >= z2) {
            Closer(x1, y1, x2, y2);
        } else {
            Closer(x3, y3, x4, y4);
        }
    }
}