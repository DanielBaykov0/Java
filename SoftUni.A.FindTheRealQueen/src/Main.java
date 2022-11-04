import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 8;
        int cols = 8;

        char[][] table = readMatrix(scanner, rows, cols);

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                char element = table[i][j];

                if (element == 'q') {
                    if (check(table, i, j)) {
                        System.out.print(i + " ");
                        System.out.print(j);
                    }
                }
            }
        }
    }

    private static char[][] readMatrix(Scanner scanner, int rows, int cols) {
        char[][] matrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                char currentChar = line[j].charAt(0);
                matrix[i][j] = currentChar;
            }
        }

        return matrix;
    }

    private static boolean check(char[][] table, int row, int element) {

        for (int i = element + 1; i < table[row].length; i++) { // right horizontal
            char ch = table[row][i];

            if (ch == 'q') {
                return false;
            }
        }

        for (int i = element - 1; i >= 0; i--) { // left horizontal
            char ch = table[row][i];

            if (ch == 'q') {
                return false;
            }
        }

        for (int i = row + 1; i < table.length; i++) { // down
            char ch = table[i][element];

            if (ch == 'q') {
                return false;
            }
        }

        for (int i = row - 1; i >= 0; i--) {  // up
            char ch = table[i][element];

            if (ch == 'q') {
                return false;
            }
        }

        int uldElement = element - 1;

        for (int i = row - 1; i >= 0 && uldElement >= 0; i--, uldElement--) { // up left diagonal
            char ch = table[i][uldElement];

            if (ch == 'q') {
                return false;
            }
        }

        int urdElement = element + 1;

        for (int i = row - 1; i >= 0 && urdElement < table[i].length; i--, urdElement++) {  // up right diagonal
            char ch = table[i][urdElement];

            if (ch == 'q') {
                return false;
            }
        }

        int dldElement = element - 1;

        for (int i = row + 1; i < table.length && dldElement >= 0; i++, dldElement--) {  // down left diagonal
            char ch = table[i][dldElement];

            if (ch == 'q') {
                return false;
            }
        }

        int drdElement = element + 1;

        for (int i = row + 1; i < table.length && drdElement < table[row].length; i++, drdElement++) { // down right diagonal
            char ch = table[i][drdElement];

            if (ch == 'q') {
                return false;
            }
        }

        return true;
    }
}