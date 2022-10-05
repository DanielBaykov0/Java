import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int num = scanner.nextInt();
        int n1 = 1;
        int n2 = 1;
        int n3 = 2;
        int n4;

        System.out.print(n1 + " " + n2 + " " + n3);

        for (int i = 4; i <= num; ++i) {
            n4 = n3 + n2 + n1;
            System.out.print(" " + n4);
            n1 = n2;
            n2 = n3;
            n3 = n4;
        }
    }
}