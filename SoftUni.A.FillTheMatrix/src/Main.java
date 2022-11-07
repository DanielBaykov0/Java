import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String pattern = scanner.nextLine();

        if (pattern.equals("A")) {
            matrixPatternA(n);
        } else if (pattern.equals("B")) {
            matrixPatternB(n);
        } else {
            System.out.println("Wrong pattern");
        }


    }

    private static void matrixPatternA(int n) {

        int[][] matrix = new int[n][n];

        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = counter;
                counter++;
            }
        }

        print(matrix);
    }

    private static void matrixPatternB(int n) {

        int[][] matrix = new int[n][n];

        int counter = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = counter;
                    counter++;
                }
            } else {
                for (int k = n - 1; k >= 0; k--) {
                    matrix[k][i] = counter;
                    counter++;
                }
            }
        }

        print(matrix);
    }

    private static void print(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}