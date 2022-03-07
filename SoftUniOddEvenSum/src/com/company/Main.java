package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers; i++) {
            int n = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes \n" + "Sum = " + evenSum);
        } else {
            System.out.println("No \n" + "Diff = " + Math.abs(evenSum - oddSum));
        }
    }
}
