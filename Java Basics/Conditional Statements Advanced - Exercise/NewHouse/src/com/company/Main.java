package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;

        if ("Roses".equals(flowers)) {
            sum = flowersCount * 5;
            if (flowersCount > 80) {
                sum = sum - (sum * 0.10);
            }
        } else if ("Dahlias".equals(flowers)) {
            sum = flowersCount * 3.80;
            if (flowersCount > 90) {
                sum = sum - (sum * 0.15);
                }
        } else if ("Tulips".equals(flowers)) {
            sum = flowersCount * 2.80;
            if (flowersCount > 80) {
                sum = sum - (sum * 0.15);
            }
        } else if ("Narcissus".equals(flowers)) {
            sum = flowersCount * 3;
            if (flowersCount < 120) {
                sum = sum + (sum * 0.15);
            }
        } else if ("Gladiolus".equals(flowers)) {
            sum = flowersCount * 2.50;
            if (flowersCount < 80) {
                sum = sum + (sum * 0.20);
            }
        }
        if (sum > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", (sum - budget));
        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowers, (budget - sum));
        }
    }
}
