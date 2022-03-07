package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startingNum = Integer.parseInt(scanner.nextLine());
        int lastNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int combination = 0;

        for (int i = startingNum; i <= lastNum; i++) {
            for (int j = startingNum; j <= lastNum; j++) {
                combination++;

                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combination, magicNum);
    }
}
