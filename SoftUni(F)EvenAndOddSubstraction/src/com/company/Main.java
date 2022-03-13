package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = (Arrays.stream(scanner.nextLine().split(" "))
                . mapToInt(value -> Integer.parseInt(value)).toArray());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }
        int sub = evenSum - oddSum;
        System.out.println(sub);
    }
}
