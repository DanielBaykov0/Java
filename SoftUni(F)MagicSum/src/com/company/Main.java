package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }

    }
}
