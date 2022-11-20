import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        Pattern pattern = Pattern.compile("(.+)-(.+)");

        Map<String, String> map = new TreeMap<>();

        while (!(input = scanner.nextLine()).equals("search")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                map.put(matcher.group(1),matcher.group(2));
            }
        }

        while (!(input = scanner.nextLine()).equals("stop")) {
            if (map.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, map.get(input));
            } else {
                System.out.printf("Contact %s does not exist.\n", input);
            }
        }
    }
}