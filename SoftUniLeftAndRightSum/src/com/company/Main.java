package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < 2 * numbers; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (i < numbers) {
                firstSum += num;
            } else {
                secondSum += num;
            }
        }
        if (firstSum == secondSum) {
            System.out.println("Yes, sum = " + firstSum);
        } else {
            System.out.println("No, diff = " + Math.abs(firstSum - secondSum));
        }
    }
}
