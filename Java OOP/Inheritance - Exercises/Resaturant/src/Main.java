import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double caffeine = Double.parseDouble(scanner.nextLine());

        Coffee coffee = new Coffee(name, caffeine);

        System.out.println(coffee.getPrice());
    }
}