import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(sc.nextLine());

        String[] phrases = new String[]{"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int rndPhrase = random.nextInt(phrases.length);
            int rndEvents = random.nextInt(events.length);
            int rndAuthors = random.nextInt(authors.length);
            int rndCities = random.nextInt(cities.length);

            System.out.println(String.join(" ",
                    phrases[rndPhrase] + " " + events[rndEvents] + " "
                            + authors[rndAuthors] + " " + cities[rndCities]));
        }
    }
}