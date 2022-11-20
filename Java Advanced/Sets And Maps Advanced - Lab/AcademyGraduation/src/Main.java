import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double[]> graduationList = new TreeMap<>();

        int count = n;

        while (count-- > 0) {
            String name = scanner.nextLine();
            String[] scoresStrings = scanner.nextLine().split(" ");
            Double[] scores = new Double[scoresStrings.length];

            for (int i = 0; i < scoresStrings.length; i++) {
                scores[i] = Double.parseDouble(scoresStrings[i]);
            }

            graduationList.put(name, scores);
        }

        for (Map.Entry<String, Double[]> entry : graduationList.entrySet()) {
            System.out.println(entry.getKey() + " is graduated with " + Arrays.stream(entry.getValue()).mapToDouble(e -> e).average().getAsDouble());
        }
    }
}