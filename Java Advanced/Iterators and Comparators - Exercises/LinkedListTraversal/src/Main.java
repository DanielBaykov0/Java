import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] items = scanner.nextLine().split("\\s+");

            switch (items[0]) {
                case "Add":
                    myLinkedList.add(Integer.valueOf(items[1]));
                    break;
                case "Remove":
                    myLinkedList.remove(Integer.parseInt(items[1]));
                    break;
            }
        }

        System.out.println(myLinkedList.getSize());

        for (Integer i : myLinkedList) {
            System.out.print(i + " ");
        }
    }
}