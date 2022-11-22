import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] availableCoins = new int[] {1, 2, 5, 10, 20, 50};
        int targetSum = 923;

        Map<Integer, Integer> selectedCoins = chooseCoins(availableCoins, targetSum);

        System.out.printf("Number of coins to take: %d",
                selectedCoins.values().stream().mapToInt(Integer::intValue).sum());
        System.out.println();

        for (Integer i : selectedCoins.keySet()) {
            System.out.printf("%d coin(s) with value %d", selectedCoins.get(i), i);
            System.out.println();
        }
    }

    private static Map<Integer, Integer> chooseCoins(int[] availableCoins, int targetSum) {

        Arrays.sort(availableCoins);
        List<Integer> sortedCoins = Arrays.stream(availableCoins).boxed().collect(Collectors.toList());
        Collections.reverse(sortedCoins);

        Map<Integer, Integer> chosenCoins = new LinkedHashMap<>();
        int currentSum = 0;
        int coinIndex = 0;

        while (currentSum != targetSum && coinIndex < sortedCoins.size()) {
            int currentCoinValue = sortedCoins.get(coinIndex);

            int remainingSum = targetSum - currentSum;
            int numberOfCoinsToTake = remainingSum / currentCoinValue;

            if (numberOfCoinsToTake > 0) {
                chosenCoins.putIfAbsent(currentCoinValue, numberOfCoinsToTake);
                currentSum += currentCoinValue * numberOfCoinsToTake;
            }

            coinIndex++;
        }

        if (currentSum == targetSum) {
            return chosenCoins;
        } else {
            throw new IllegalArgumentException();
        }
    }
}