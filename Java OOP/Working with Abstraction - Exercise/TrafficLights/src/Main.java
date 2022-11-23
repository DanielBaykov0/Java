import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lights = scanner.nextLine().split(" ");
        List<TLight> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (String s : lights) {
            if (s.equals("RED") || s.equals("GREEN") || s.equals("YELLOW")) {
                list.add(TLight.valueOf(s));
            }
        }

        while (n-- > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}