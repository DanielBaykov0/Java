import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Set<String> regular = new LinkedHashSet<>();
        Set<String> vip = new LinkedHashSet<>();

        while (!line.equals("PARTY")) {
            if (Character.isDigit(line.charAt(0)) || Character.isUpperCase(line.charAt(0))) {
                vip.add(line);
            } else {
                regular.add(line);
            }
            line = scanner.nextLine();
        }

        while (!line.equals("END")) {
            if ((Character.isDigit(line.charAt(0)) || Character.isUpperCase(line.charAt(0))) && vip.contains(line)) {
                vip.remove(line);
            } else {
                regular.remove(line);
            }
            line = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        for (String s : vip) {
            System.out.println(s);
        }

        for (String s : regular) {
            System.out.println(s);
        }
    }
}