import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();

        int num = Integer.parseInt(scanner.nextLine());

        if (num == 0) {
            System.out.println("Enter a bigger number");
        }

        while (num != 0) {
            stack.push(num % 2);
            num /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}