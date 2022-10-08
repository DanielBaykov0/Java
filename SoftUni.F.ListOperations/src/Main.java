import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("End")) {

            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(tokens[1]);
                    nums.add(numToAdd);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    if (isValidIndex(indexToInsert, nums)) {
                        nums.add(indexToInsert, numToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    if (isValidIndex(indexToRemove, nums)) {
                        nums.remove(indexToRemove);
                    } else {
                        System.out.print("Invalid index");
                    }
                    break;
                case "Shift":
                    int countToMove = Integer.parseInt(tokens[2]);
                    if (tokens[1].equals("left")) {
                        for (int i = 0; i < countToMove; i++) {
                            int currentFirstNum = nums.get(0);
                            for (int j = 0; j < nums.size() - 1; j++) {
                             int nextElement = nums.get(j + 1);
                             nums.set(j, nextElement);
                            }
                            nums.set(nums.size() - 1, currentFirstNum);
                        }
                    } else if (tokens[1].equals("right")) {
                        for (int i = 0; i < countToMove; i++) {
                            int currentLastNum = nums.get(nums.size() - 1);
                            for (int j = nums.size() - 1; j > 0; j--) {
                                int nextElement = nums.get(j - 1);
                                nums.set(j, nextElement);
                            }
                            nums.set(0, currentLastNum);
                        }
                    }
                    break;
            }

            line = scanner.nextLine();
        }

        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }

    public static boolean isValidIndex(int index, List<Integer> numbers) {
        if (index >=0 && index < numbers.size()) {
            return true;
        } else {
            return false;
        }
    }
}