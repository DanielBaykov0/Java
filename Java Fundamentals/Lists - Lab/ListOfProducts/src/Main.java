import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String currentProduct = scanner.nextLine();
            products.add(currentProduct);
        }

        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {

            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }

    }
}