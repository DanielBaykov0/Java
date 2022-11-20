import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Box<Double>> list = new ArrayList<>();

        int n = Integer.parseInt(bufferedReader.readLine());
        while (n-- > 0) {
            double input = Double.parseDouble(bufferedReader.readLine());

            list.add(new Box<>(input));
        }

        double m = Double.parseDouble(bufferedReader.readLine());
        System.out.println(count(list, m));
    }

    private static <T extends Comparable<T>> long count(List<Box<T>> list, T element) {
        long count1 = 0L;

        for (Box<T> box : list) {
            if (box.compareTo(new Box<T>(element)) > 0) {
                count1++;
            }
        }

        return count1;
    }
}