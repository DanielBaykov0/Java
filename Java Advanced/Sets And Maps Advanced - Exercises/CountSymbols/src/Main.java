import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, 0);
            }

            map.put(c, map.get(c) + 1);
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + ": " + m.getValue() + " time/s");
        }
    }
}