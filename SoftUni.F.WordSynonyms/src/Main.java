import java.util.*;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Integer nums = Integer.parseInt(sc.nextLine());

        Map<String, List<String>> wordSynonyms = new TreeMap<>();

        for (int i = 0; i < nums; i++) {

            String word = sc.nextLine();
            String synonym = sc.nextLine();

            List<String> currentSynonym = wordSynonyms.get(word);

            if (currentSynonym != null) {
                currentSynonym.add(synonym);
                wordSynonyms.put(word, currentSynonym);
            } else {
                currentSynonym = new ArrayList<>();
                currentSynonym.add(synonym);
                wordSynonyms.put(word, currentSynonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(",", entry.getValue()));
        }
    }
}