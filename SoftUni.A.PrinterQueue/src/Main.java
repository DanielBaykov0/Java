import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        String input = scanner.nextLine();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (!queue.isEmpty()) {
                    System.out.println("Canceled " + queue.pollFirst());
                } else {
                    System.out.println("Printer is on standby");
                    input = scanner.nextLine();
                    continue;
                }
            } else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }

        for (String s : queue) {
            System.out.println(s);
        }
    }
}