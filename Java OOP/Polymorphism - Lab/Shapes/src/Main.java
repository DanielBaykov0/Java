import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double height = Double.parseDouble(scanner.nextLine());
        Double width = Double.parseDouble(scanner.nextLine());
        Double radius = Double.parseDouble(scanner.nextLine());

        Rectangle rectangle = new Rectangle(height, width);
        Circle circle = new Circle(radius);

        System.out.println("Rectangle perimeter = " + rectangle.calculatePerimeter() +
                "\nRectangle area = " + rectangle.calculateArea());

        System.out.println("Circle perimeter = " + circle.calculatePerimeter() +
                "\nCircle area = " + circle.calculateArea());
    }
}