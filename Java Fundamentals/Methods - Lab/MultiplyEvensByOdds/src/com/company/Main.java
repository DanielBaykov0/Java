package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(Main.getMultipleOfEvensAndOdds(Math.abs(n)));
    }

    private static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getEvenSum(n);
        int oddSum = getOddSum(n);

        return evenSum * oddSum;
    }

    private static int getEvenSum(int n) {
        int evenSum = 0;
        while (n > 0) {
            int ostatuk = n % 10;
            n /= 10;
            if (ostatuk % 2 == 0) {
                evenSum += ostatuk;
            }
        }

        return evenSum;
    }

    private static int getOddSum(int n) {
        int oddSum = 0;
        while (n > 0) {
            int ostatuk = n % 10;
            n /= 10;

            if (ostatuk % 2 == 1) {
                oddSum += ostatuk;
            }
        }

        return oddSum;
    }
}
