package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (secondArray[i].equals(firstArray[j])) {
                    System.out.print(secondArray[i] + " ");
                }
            }
        }

    }
}
