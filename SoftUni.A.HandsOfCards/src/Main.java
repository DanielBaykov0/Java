import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, HashSet<String>> map = new TreeMap<>();

        String input;

        while (!(input = scanner.nextLine()).equals("JOKER")) {
            String[] items = input.split(": ");

            if (!map.containsKey(items[0])) {
                List<String> list = Arrays.stream(items[1].split(", ")).collect(Collectors.toList());
                map.put(items[0], new LinkedHashSet<>());
                map.get(items[0]).addAll(list);
            } else {
                List<String> list = Arrays.stream(items[1].split(", ")).collect(Collectors.toList());
                map.get(items[0]).addAll(list);
            }
        }

//        map.forEach((k, v) -> {
//            int power = calculatePower(v);
//            System.out.printf("%s: %d%n", k, power);
//        });

        for (Map.Entry<String, HashSet<String>> m : map.entrySet()) {
            System.out.println(m.getKey() + ": " + calculatePower(m.getValue()));
        }
    }

    private static int calculatePower(HashSet<String> value) {
        int power = 0;

        for (String s : value) {
            power += calcCardPower(s);
        }

        return power;
    }

    private static int calcCardPower(String s) {
        int power = 0;

        switch (s.substring(0, s.length() - 1)) {
            case "2":
                power = 2;
                break;
            case "3":
                power = 3;
                break;
            case "4":
                power = 4;
                break;
            case "5":
                power = 5;
                break;
            case "6":
                power = 6;
                break;
            case "7":
                power = 7;
                break;
            case "8":
                power = 8;
                break;
            case "9":
                power = 9;
                break;
            case "10":
                power = 10;
                break;
            case "J":
                power = 11;
                break;
            case "Q":
                power = 12;
                break;
            case "K":
                power = 13;
                break;
            case "A":
                power = 14;
                break;
        }

        switch (s.substring(s.length() - 1)) {
            case "S":
                power *= 4;
                break;
            case "H":
                power *= 3;
                break;
            case "D":
                power *= 2;
                break;
        }

//        System.out.println(power);
        return power;
    }
}