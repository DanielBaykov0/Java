import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> urls = new ArrayDeque<>();
        String input = scanner.nextLine();

        String current = "";

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!urls.isEmpty()) {
                    current = urls.pop();
                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else {
                if (!current.equals("")) {
                    urls.push(current);
                }
                current = input;
            }

            System.out.println(current);
            input = scanner.nextLine();
        }

    }
}