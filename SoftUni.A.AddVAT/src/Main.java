import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] price = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble).toArray();

        UnaryOperator<Double> addVat = value -> value * 1.2;

        System.out.println("Prices with VAT: ");

        for (double d : price) {
            double priceWithVat = addVat.apply(d);
            System.out.printf("%.2f", priceWithVat);
            System.out.println();
        }
    }
}