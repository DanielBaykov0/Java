package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int sum = startingPoints;
        int averagePoints = 0;
        int wins = 0;
        double averagePercent = 0;

        for (int i = 1; i <= tournaments; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    sum += 2000;
                    break;
                case "F":
                    sum += 1200;
                    break;
                case "SF":
                    sum += 720;
                    break;
            }
            if (result.equals("W")) {
                wins++;
            }
        }
        averagePoints = (sum - startingPoints) / tournaments;
        averagePercent = (double) wins / tournaments * 100;

        System.out.printf("Final points: %.0f \n", Math.floor(sum));
        System.out.printf("Average points: %.0f \n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", averagePercent);

    }
}
