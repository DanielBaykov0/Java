package com.company;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (group.equals("Students")) {
            if (day.equals("Friday")) {
                price = n * 8.45;
                if (n >= 30) {
                    price = (n * 8.45) - (price * 0.15);
                }
            } else if (day.equals("Saturday")) {
                price = n * 9.80;
                if (n >= 30) {
                    price = (n * 9.80) - (price * 0.15);
                }
            } else if (day.equals("Sunday")) {
                price = n * 10.46;
                if (n >= 30) {
                    price = (n * 10.46) - (price * 0.15);
                }
            }
        } else if (group.equals("Business")) {
            if (day.equals("Friday")) {
                price = n * 10.90;
                if (n >= 100) {
                    price = (n * 8.45) - 109;
                }
            } else if (day.equals("Saturday")) {
                price = n * 15.60;
                if (n >= 100) {
                    price = (n * 15.60) - 156;
                }
            } else if (day.equals("Sunday")) {
                price = n * 16;
                if (n >= 100) {
                    price = (n * 16) - 160;
                }
            }
        } else if (group.equals("Regular")) {
            if (day.equals("Friday")) {
                price = n * 15;
                if (n >= 10 && n <= 20) {
                    price = (n * 15) - (price * 0.15);
                }
            } else if (day.equals("Saturday")) {
                price = n * 20;
                if (n >= 10 && n <= 20) {
                    price = (n * 20) - (price * 0.15);
                }
            } else if (day.equals("Sunday")) {
                price = n * 22.50;
                if (n >= 10 && n <= 20) {
                    price = (n * 22.50) - (price * 0.15);
                }
            }
        }

        System.out.printf("%.2f", price);
    }
}
