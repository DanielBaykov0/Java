package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        boolean isValid = false;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = i; j >= 0; j--) {
                leftSum += numbers[j];
            }
            for (int j = i; j < numbers.length; j++) {
                rightSum += numbers[j];
            }

            leftSum -= numbers[i];
            rightSum -= numbers[i];

            if (leftSum == rightSum) {
                isValid = true;
                index = i;
                break;
            }
        }

        if (isValid) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
