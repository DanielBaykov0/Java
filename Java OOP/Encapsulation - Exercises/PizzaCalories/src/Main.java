import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Pizza pizza = createNewPizza(reader);
            Dough dough = getDough(reader);
            pizza.setDough(dough);
            addToppings(reader, pizza);

            System.out.println(pizza);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Pizza createNewPizza(BufferedReader reader) throws IOException {
        String[] tokens = reader.readLine().split("\\s+");
        String pizzaName = tokens[1];
        int numberOfToppings = Integer.parseInt(tokens[2]);

        return new Pizza(pizzaName, numberOfToppings);
    }

    private static void addToppings(BufferedReader reader, Pizza pizza) throws IOException {
        String line;
        while (!(line = reader.readLine()).equals("END")) {
            String[] tokens = line.split("\\s+");
            String type = tokens[1];
            int weight = Integer.parseInt(tokens[2]);

            Topping topping = new Topping(type, weight);
            pizza.addTopping(topping);
        }
    }

    private static Dough getDough(BufferedReader reader) throws IOException {
        String[] tokens = reader.readLine().split("\\s+");
        String type = tokens[1];
        String technique = tokens[2];
        int weight = Integer.parseInt(tokens[3]);

        return new Dough(type, technique, weight);
    }
}