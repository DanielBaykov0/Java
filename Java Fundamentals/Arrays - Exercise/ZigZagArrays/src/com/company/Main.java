package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(value -> Integer.parseInt(value)).toArray();
            for (int j = 0; j < input.length - 1; j++) {
                secondArray[i] = input[j];
                firstArray[i] = input[j + 1];
            }
        }

        for (int i = 0; i < n; i+= 2) {
            int temp = 0;
            temp = secondArray[i];
            secondArray[i] = firstArray[i];
            firstArray[i] = temp;
        }

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
    }
}
