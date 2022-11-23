import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = scanner.nextLine().split(" ");

        System.out.printf("%.2f",
                PriceCalculator.calculate(Double.parseDouble(items[0]),
                        Integer.parseInt(items[1]),
                        Season.valueOf(items[2]),
                        Discount.valueOf(items[3])
                ));
    }
}