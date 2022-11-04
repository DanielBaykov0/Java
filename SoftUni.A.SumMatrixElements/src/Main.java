import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(", ")).filter(Predicate.not(String::isBlank))
                .mapToInt(Integer::parseInt).toArray();

        int row = input[0];
        int col = input[1];

        int[][] natrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", ")).filter(Predicate.not(String::isBlank))
                    .mapToInt(Integer::parseInt).toArray();

            natrix[i] = arr;
        }

        System.out.println(row);
        System.out.println(col);

        int sum = 0;
        for (int[] ints : natrix) {
            for (int j = 0; j < ints.length; j++) {
                sum += ints[j];
            }
        }

        System.out.println(sum);
    }
}