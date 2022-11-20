import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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

        int[] nums = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        swap(list, nums);

        list.forEach(System.out::println);
    }

    private static <T> void swap(List<Box<T>> list, int[] nums) {
        int firstNum = nums[0];
        int secondNum = nums[1];

        Box<T> box = list.get(firstNum);
        list.set(firstNum, list.get(secondNum));
        list.set(secondNum, box);
    }
}