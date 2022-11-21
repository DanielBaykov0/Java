import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ListIterator<String> listIterator = null;

        String line;

        while (!(line = bufferedReader.readLine()).equalsIgnoreCase("END")) {
            String[] input = line.split("\\s+");

            switch (input[0]) {
                case "Create":
                    String[] items = Arrays.stream(input).skip(1).toArray(String[]::new);
                    listIterator = new ListIterator<>(items);
                    break;
                case "Move":
                    System.out.println(listIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listIterator.hasNext());
                    break;
                case "Print":
                    try {
                        listIterator.print();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());;
                    }
                    break;
                case "PrintAll":
                    listIterator.printAll();
                    break;
            }
        }
    }
}