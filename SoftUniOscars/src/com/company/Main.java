package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int lectors = Integer.parseInt(scanner.nextLine());
        double result = 1250.5;

        for (int i = 1; i <= lectors; i++) {
            String lectorName = scanner.nextLine();
            double lectorPoint = Double.parseDouble(scanner.nextLine());

            academyPoints = academyPoints + ((lectorName.length() * lectorPoint) / 2);

            if (academyPoints > result) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, academyPoints);
                break;
            }
        }
        if (result > academyPoints) {
            System.out.printf("Sorry, %s you need %.1f more!", name, (result - academyPoints));
        }

    }
}
