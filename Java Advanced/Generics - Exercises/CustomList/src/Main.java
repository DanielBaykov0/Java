import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        MyList<String> listString = new MyList<>();

        String input;
        while (!(input = bufferedReader.readLine()).equalsIgnoreCase("END")) {
            String[] items = input.split(" ");

            command(items, listString);
        }
    }

    private static void command(String[] items, MyList<String> list) {
        String line = items[0];

        switch (line) {
            case "Add":
                list.add(items[1]);
                break;
            case "Remove":
                list.remove(Integer.parseInt(items[1]));
                break;
            case "Contains":
                System.out.println(list.contains(items[1]));;
                break;
            case "Swap":
                list.swap(Integer.parseInt(items[1]), Integer.parseInt(items[2]));
                break;
            case "Greater":
                System.out.println(list.countGreaterThan(items[1]));;
                break;
            case "Max":
                System.out.println(list.getMax());;
                break;
            case "Min":
                System.out.println(list.getMin());;
                break;
            case "Print":
                list.print().forEach(System.out::println);
                break;
        }
    }
}