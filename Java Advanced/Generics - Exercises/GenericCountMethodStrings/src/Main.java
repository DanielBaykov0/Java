import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Box<String>> list = new ArrayList<>();

        int n = Integer.parseInt(bufferedReader.readLine());
        while (n-- > 0) {
            String line = bufferedReader.readLine();

            list.add(new Box<>(line));
        }

        String line = bufferedReader.readLine();

        System.out.println(count(list, line));
    }

    private static <T extends Comparable<T>> long count(List<Box<T>> list, T element) {

        long count = 0L;
        for (Box<T> e : list) {
            if (e.compareTo(new Box<>(element)) > 0) {
                count++;
            }
        }
        return count;
    }
}