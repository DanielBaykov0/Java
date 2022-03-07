package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            if ("summer".equals(season)) {
                System.out.printf("Camp - %.2f", (budget * 0.30));
            }else if ("winter".equals(season)) {
                System.out.printf("Hotel - %.2f", (budget * 0.70));
            }
        }else if (budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            if ("summer".equals(season)) {
                System.out.printf("Camp - %.2f", (budget * 0.40));
            }else if ("winter".equals(season)) {
                System.out.printf("Hotel - %.2f", (budget * 0.80));
            }
        }else {
            System.out.println("Somewhere in Europe");
            if ("summer".equals(season)) {
                System.out.printf("Hotel - %.2f", (budget * 0.90));
            }else if ("winter".equals(season)) {
                System.out.printf("Hotel - %.2f", (budget * 0.90));
            }
        }
    }
}
