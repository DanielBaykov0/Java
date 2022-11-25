import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Snake snake = new Snake(name);
        Bear bear = new Bear(name);

        System.out.println(snake.getName());
        System.out.println(bear.getName());
    }
}