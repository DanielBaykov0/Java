import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = bufferedReader.readLine().substring(10).split(", ");
        int[] universe = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            universe[i] = Integer.parseInt(elements[i]);
        }

        int numberOfSets = Integer.parseInt(bufferedReader.readLine().substring(16));
        List<int[]> sets = new ArrayList<>();

        for (int i = 0; i < numberOfSets; i++) {
            String[] setElements = bufferedReader.readLine().split(", ");
            int[] set = new int[setElements.length];

            for (int j = 0; j < setElements.length; j++) {
                set[j] = Integer.parseInt(setElements[j]);
            }

            sets.add(set);
        }

        List<int[]> chosenSets = chooseSets(sets, universe);

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Sets to take (%d):%n", chosenSets.size()));

        for (int[] set : chosenSets) {
            sb.append("( ");
            sb.append(Arrays.toString(set).replaceAll("\\[|]", ""));
            sb.append(" )").append(System.lineSeparator());
        }
        System.out.println(sb);
    }

    private static List<int[]> chooseSets(List<int[]> sets, int[] universe) {
        List<int[]> selectedSets = new ArrayList<>();
        List<int[]> universeSet = new ArrayList<>();
        universeSet.add(universe);

        while (!universeSet.isEmpty()) {
            int notChosenCount = 0;
            int[] chosenSet = sets.get(0);

            for (int[] set : sets) {
                int count = 0;

                for (int elem : set) {
                    if (universeSet.contains(elem)) {
                        count++;
                    }
                }

                if (notChosenCount < count) {
                    notChosenCount = count;
                    chosenSet = set;
                }
            }

            selectedSets.add(chosenSet);
            universeSet.remove(chosenSet);
        }

        return selectedSets;
    }
}