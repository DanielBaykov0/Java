import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input, key = null;
        boolean isEmail = true;
        Map<String, String> map = new TreeMap<>();

        while (!(input = scanner.nextLine()).equals("stop")) {
            if (isEmail) {
                key = input;
                isEmail = false;
            } else {
                if (!input.toLowerCase().endsWith(".uk") && !input.toLowerCase().endsWith(".us") && !input.toLowerCase().endsWith(".com")) {
                    map.put(key, input);
                }
                isEmail = true;
            }
        }

        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
    }
}