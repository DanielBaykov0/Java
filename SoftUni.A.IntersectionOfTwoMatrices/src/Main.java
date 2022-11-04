public class Main {
    public static void main(String[] args) {

        int m = 3;
        int n = 4;

        Object[][] A = { { 'a', 'b', 'c', 'd' },
                { 'a', 'b', 'c', 'd' },
                { 'a', 'b', 'c', 'd' }};
        Object[][] B = { { 'k', 'b', 'c', 'k' },
                { 'a', 'b', 'g', 'd' },
                { "a", 'k', 'c', 'd' }};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j].equals(B[i][j])) {
                    System.out.print(A[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}