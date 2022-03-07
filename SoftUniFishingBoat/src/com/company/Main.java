package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;

        if ("Spring".equals(season)) {
            sum = 3000.00;
            if (fishersCount <= 6) {
                sum = sum - (sum * 0.10);
            } else if (fishersCount <= 11) {
                sum = sum - (sum * 0.15);
            } else {
                sum = sum - (sum * 0.25);
            }
            if (fishersCount % 2 == 0) {
                sum = sum - (sum * 0.05);
            }
        } else if ("Summer".equals(season) || "Autumn".equals(season)) {
            sum = 4200.00;
            if (fishersCount <= 6) {
                sum = sum - (sum * 0.10);
            } else if (fishersCount <= 11) {
                sum = sum - (sum * 0.15);
            } else {
                sum = sum - (sum * 0.25);
            }
            if ("Summer".equals(season) && fishersCount % 2 == 0) {
                sum = sum - (sum * 0.05);
            }
        }else if ("Winter".equals(season)) {
            sum = 2600.00;
            if (fishersCount <= 6) {
                sum = sum - (sum * 0.10);
            } else if (fishersCount <= 11) {
                sum = sum - (sum * 0.15);
            } else {
                sum = sum - (sum * 0.25);
            }
            if (fishersCount % 2 == 0) {
                sum = sum - (sum * 0.05);
            }
        }
        if (budget >= sum) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - sum));
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", (sum - budget));
        }
    }
}
