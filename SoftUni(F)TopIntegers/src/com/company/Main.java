package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myInt = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        for (int i = 0; i < myInt.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < myInt.length; j++) {
                if (myInt[i] <= myInt[j]) {
                    isBigger = false;
                    break;
                }
            }

            if (isBigger) {
                System.out.print(myInt[i] + " ");
            }
        }
    }
}