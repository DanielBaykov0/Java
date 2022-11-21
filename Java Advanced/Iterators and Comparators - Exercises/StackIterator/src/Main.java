import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyStack<Integer> stack = new MyStack<>();

        String line;
        while (!(line = scanner.nextLine()).equalsIgnoreCase("End")) {
            String[] input = line.split("\\s+", 2);

            switch (input[0]) {
                case "Push":
                    input = input[1].split(",\\s+");
                    for (String s : input) {
                        stack.push(Integer.valueOf(s.trim()));
                    }
                    break;
                case "Pop":
                    try {
                        stack.pop();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }

        for (Integer i : stack) {
            System.out.println(i);
        }

        for (Integer i : stack) {
            System.out.println(i);
        }
    }
}