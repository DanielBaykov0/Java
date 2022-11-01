import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);

        for (int i = 0; i < 50; i++) {
            int num = queue.peek();
            queue.offer(num + 1);
            queue.offer(2 * num + 1);
            queue.offer(num + 2);

            System.out.print(queue.poll() + " ");
        }
    }
}