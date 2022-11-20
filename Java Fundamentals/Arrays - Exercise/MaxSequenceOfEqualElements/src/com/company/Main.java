package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] elements = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int maxCount = 0;
        int sequence = 0;
        int index = 0;

        for (int i = 0; i < elements.length; i++) {
            int count = 0;
            for (int j = i; j < elements.length; j++) {
                if (elements[i] == elements[j]) {
                    count++;
                    index = i;
                    if (count > maxCount) {
                        maxCount = count;
                        sequence = index;
                    }
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(elements[i + sequence] + " ");
        }
    }
}
