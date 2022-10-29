import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String items = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < items.length(); i++) {
            char current = items.charAt(i);

            if (current == '(') {
                stack.push(i);
            } else if (current == ')') {
                int startIndex = stack.pop();
                String contents = items.substring(startIndex, i + 1);
                System.out.println(contents);
            }
        }

    }
}