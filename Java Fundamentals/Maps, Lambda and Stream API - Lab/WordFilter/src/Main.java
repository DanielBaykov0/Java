import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // prints words with even length
        String[] words = Arrays.stream(sc.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0).toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }


    }
}