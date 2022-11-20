import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> towns = new LinkedHashMap<>();

        int count = n;

        while (count-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            if (!towns.containsKey(continent)) {
                towns.put(continent, new LinkedHashMap<>() {{
                    put(country, new ArrayList<>() {{
                        add(city);
                    }});
                }});
            } else {
                if (!towns.get(continent).containsKey(country)) {
                    towns.get(continent).put(country, new ArrayList<>() {{
                        add(city);
                    }});
                } else {
                    towns.get(continent).get(country).add(city);
                }
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> entry : towns.entrySet()) {

            System.out.print(entry.getKey() + ":\n");

            for (Map.Entry<String, ArrayList<String>> entry1 : entry.getValue().entrySet()) {
                System.out.print(entry1.getKey() + " -> ");

                System.out.print(String.join(", ", entry1.getValue()));

                System.out.println();
            }
        }
    }
}