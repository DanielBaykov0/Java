package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] firstArray = (Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(value -> Integer.parseInt(value)).toArray());

        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(value -> Integer.parseInt(value)).toArray();

        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {
            sum += firstArray[i];
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }

        }
        System.out.printf("Arrays are identical. Sum: %d", sum);

    }
}
