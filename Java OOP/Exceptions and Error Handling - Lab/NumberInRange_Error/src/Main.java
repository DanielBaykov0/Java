import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(" ");
        int startIndex = Integer.parseInt(items[0]);
        int endIndex = Integer.parseInt(items[1]);
        System.out.println(String.format("Range: [%s...%s]", startIndex, endIndex));

        int num = numberValidator(scanner, startIndex, endIndex);
        System.out.println("Valid number: " + num);
    }

    private static int numberValidator(Scanner scanner, int startIndex, int endIndex) {

        while (true) {
            String input = scanner.nextLine();
            try {
                int num = Integer.parseInt(input);
                if (num >= startIndex && num <= endIndex) {
                    return num;
                }
            } catch (Exception ignored) {

            }
            System.out.println("Invalid number: " + input);
        }
    }
}
