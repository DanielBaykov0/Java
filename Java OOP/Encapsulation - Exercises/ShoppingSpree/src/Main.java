import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new HashMap<>();

        try {
            fillPersonDatabase(personMap, reader);
            fillProductDatabase(productMap, reader);

            String line;
            while (!(line = reader.readLine()).equals("END")) {
                buyTheProduct(personMap, productMap, line);

            }
            personMap.values().forEach(System.out::println);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void buyTheProduct(Map<String, Person> personMap, Map<String, Product> productMap, String line) {
        String[] lineTokens = line.split("\\s+");
        String personName = lineTokens[0];
        String productName = lineTokens[1];

        try {
            personMap.get(personName).buyProduct(productMap.get(productName));
            System.out.printf("%s bought %s%n", personName, productName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void fillProductDatabase(Map<String, Product> productMap, BufferedReader reader) throws IOException {
        String[] personsArr = reader.readLine().trim().split(";");

        for (String input : personsArr) {
            String[] tokens = input.split("=");
            String name = tokens[0];
            double cost = Double.parseDouble(tokens[1]);

            Product product = new Product(name, cost);

            if (productMap.containsKey(name)) {
                productMap.get(name).addNewCost(cost);
            }
            productMap.putIfAbsent(name, product);
        }
    }

    private static void fillPersonDatabase(Map<String, Person> personMap, BufferedReader reader) throws IOException {
        String[] arr = reader.readLine().trim().split(";");

        for (String input : arr) {
            String[] tokens = input.split("=");
            String name = tokens[0];
            double money = Double.parseDouble(tokens[1]);

            Person person = new Person(name, money);

            if (personMap.containsKey(name)) {
                personMap.get(name).addMoneyToBudget(money);
            }
            personMap.putIfAbsent(name, person);

        }
    }
}