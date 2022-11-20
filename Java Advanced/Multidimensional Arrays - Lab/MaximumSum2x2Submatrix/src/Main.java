import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);

        int biggestSum = Integer.MIN_VALUE;
        int biggestSumRow1 = -1;
        int biggestSumCol1 = -1;
        int biggestSumRow2 = -1;
        int biggestSumCol2 = -1;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int currentSum = matrix[i][j] + matrix[i+1][j] + matrix[i][j+1] + matrix[i+1][j+1];
                if (currentSum > biggestSum) {
                    biggestSum = currentSum;
                    biggestSumRow1 = matrix[i][j];
                    biggestSumRow2 = matrix[i+1][j];
                    biggestSumCol1 = matrix[i+1][j+1];
                    biggestSumCol2 = matrix[i][j+1];
                }
            }
        }

        System.out.println(biggestSumRow1 + " " + biggestSumCol2);
        System.out.println(biggestSumRow2 + " " + biggestSumCol1);
        System.out.println(biggestSum);

    }

    private static int[][] readMatrix(Scanner scanner) {
        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] nums = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(nums[j]);
            }
        }

        return matrix;
    }
}