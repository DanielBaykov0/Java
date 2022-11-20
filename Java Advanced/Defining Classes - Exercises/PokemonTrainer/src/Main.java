import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;

        Map<String, Trainer> trainersMap = new HashMap<>();

        while (!(line = scanner.nextLine()).equals("Tournament")) {
            String[] input = line.split("\\s+");

            Pokemon pokemon = new Pokemon(input[1], input[2], Integer.parseInt(input[3]));

            trainersMap.putIfAbsent(input[0], new Trainer());
            trainersMap.get(input[0]).addPokemon(pokemon);
        }

        String line1;

        while (!(line1 = scanner.nextLine()).equals("End")) {

            for (Map.Entry<String, Trainer> pokemonEntry : trainersMap.entrySet()) {
                if (pokemonEntry.getValue().pokemonCollectionSize() > 0) {
                    boolean havePokemon = false;
                    for (Pokemon pokemon : pokemonEntry.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(line1)) {
                            havePokemon = true;
                            pokemonEntry.getValue().setNumberOfBadges();
                            break;
                        }
                    }
                    if (!havePokemon) {
                        pokemonEntry.getValue().missingPokemonPenalty();
                    }
                }
            }
        }

      trainersMap.entrySet().stream()
              .sorted((b1, b2) -> Integer.compare(b2.getValue().getNumberOfBadges(), b1.getValue().getNumberOfBadges()))
              .forEach(t -> System.out.printf("%s %s %s%n", t.getKey(),
                      t.getValue().getNumberOfBadges(),
                      t.getValue().pokemonCollectionSize()));
    }
}