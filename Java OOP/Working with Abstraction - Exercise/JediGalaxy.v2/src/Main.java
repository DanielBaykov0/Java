import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    static long jediSum = 0L;
    static int rows;
    static int cols;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] dimensions = reader.readLine().split(" ");
        rows = Integer.parseInt(dimensions[0]);
        cols = Integer.parseInt(dimensions[1]);

        HashSet<String> zeroPositions = new HashSet<>();

        while (true) {
            String input = reader.readLine();
            if (input.equals("Let the Force be with you")) break;

            String[] coordinates = input.split(" ");
            int jediRow = Integer.parseInt(coordinates[0]);
            int jediCol = Integer.parseInt(coordinates[1]);

            coordinates = reader.readLine().split(" ");
            int evilRow = Integer.parseInt(coordinates[0]);
            int evilCol = Integer.parseInt(coordinates[1]);

            // process the dark path
            if (evilRow >= rows) {
                int shiftValue = evilRow - rows + 1;
                evilRow -= shiftValue;
                evilCol -= shiftValue;
            }

            if (evilCol >= cols) {
                int shiftValue = evilCol - cols + 1;
                evilRow -= shiftValue;
                evilCol -= shiftValue;
            }

            while (evilRow >= 0 && evilCol >= 0) {
                zeroPositions.add(evilRow + " " + evilCol);
                evilRow--;
                evilCol--;
            }

            //process the jedi path
            if (jediRow >= rows) {
                int shiftValue = jediRow - rows + 1;
                jediRow -= shiftValue;
                jediCol += shiftValue;
            }

            if (jediCol < 0) {
                int shiftValue = Math.abs(jediCol);
                jediRow -= shiftValue;
                jediCol += shiftValue;
            }

            while (jediRow >= 0 && jediCol < cols) {
                if (!zeroPositions.contains(jediRow + " " + jediCol)) {
                    jediSum += (long) jediRow * cols + jediCol;
                }
                jediRow--;
                jediCol++;
            }
        }

        System.out.println(jediSum);
    }
}