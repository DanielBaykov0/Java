import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        TreeMap<String, LinkedHashMap<String, Double>> shops = new TreeMap<>();

        while (!input[0].equals("Revision")) {
            String shop = input[0];
            String product = input[1];
            Double price = Double.parseDouble(input[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product, price);

            input = scanner.nextLine().split(", ");
        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : shops.entrySet()) {

            System.out.print(entry.getKey() + "->\n");

            for (Map.Entry<String, Double> entry1 : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entry1.getKey(), entry1.getValue());
            }
        }
    }
}