package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < n; i++) {
            double number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1 += 1;
            } else if (number <= 399) {
                p2 += 1;
            } else if (number <= 599) {
                p3 += 1;
            } else if (number <= 799) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
            double result1 = (double) p1 / n * 100;
            double result2 = (double) p2 / n * 100;
            double result3 = (double) p3 / n * 100;
            double result4 = (double) p4 / n * 100;
            double result5 = (double) p5 / n * 100;

            System.out.printf("%n%.2f%%", result1);
            System.out.printf("%n%.2f%%", result2);
            System.out.printf("%n%.2f%%", result3);
            System.out.printf("%n%.2f%%", result4);
            System.out.printf("%n%.2f%%", result5);

    }
}
