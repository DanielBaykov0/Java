import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayDeque<String> urls = new ArrayDeque<>();
        ArrayDeque<String> deque = new ArrayDeque<>();

        String input = "";

        while (!(input = scanner.nextLine()).equals("Home")) {

            if (input.equals("back")) {
                if (urls.size() > 1) {
                    String remove = urls.pop();
                    deque.push(remove);
                    deque.pop();
                    System.out.println(urls.peek());
                } else {
                    System.out.println("no previous URLs");
                }
                continue;
            }

            if (deque.size() > 0) {
                String something = deque.pop();
                System.out.println(something);
                urls.push(something);
            }

            System.out.println(input);
            urls.push(input);
            deque.clear();
        }
    }
}