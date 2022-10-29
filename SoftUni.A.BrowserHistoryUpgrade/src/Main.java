import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backUrls = new ArrayDeque<>();
        ArrayDeque<String> forwardUrls = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (backUrls.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    String currentURL = backUrls.pop();
                    forwardUrls.push(currentURL);
                    System.out.println(backUrls.peek());
                }
            } else if (input.equals("forward")) {
                if (forwardUrls.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    String currentForward = forwardUrls.pop();
                    System.out.println(currentForward);
                    backUrls.push(currentForward);
                }
            } else {
                backUrls.push(input);
                System.out.println(input);
                forwardUrls.clear();
            }
            input = scanner.nextLine();
        }
    }
}