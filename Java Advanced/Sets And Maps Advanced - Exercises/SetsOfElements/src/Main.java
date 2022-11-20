import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int n = input[0];
        int m = input[1];

        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        Set<Integer> set3 = new LinkedHashSet<>();


        int count1 = n;

        while (count1-- > 0) {
            int num = Integer.parseInt(scanner.nextLine());
            list1.add(num);
        }

        int count2 = m;

        while (count2-- > 0) {
            int num = Integer.parseInt(scanner.nextLine());
            list2.add(num);
        }

        for (Integer integer : list1) {
            for (Integer value : list2) {
                if (Objects.equals(integer, value)) {
                    set3.add(integer);
                }
            }
        }

        for (int s : set3) {
            System.out.print(s + " ");
        }
    }
}