import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        int count = 1;
        ArrayDeque<String> children = new ArrayDeque<>();

        for (String s : items) {
            children.offer(s);
        }

        while (children.size() > 1) {
            for (int i = 1; i < n; i++) {
                children.offer((Objects.requireNonNull(children.poll())));
            }

            if (isPrime(count)) {
                System.out.println("Prime " + children.peek());
            } else {
                System.out.println("Removed " + children.poll());
            }
            count++;
        }

        System.out.println("Last is " + children.poll());
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}