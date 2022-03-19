package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        Main.calculate(product, quantity);
    }

    private static void calculate(String product, int quantity) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", quantity * 1.50);
                break;
            case "water":
                System.out.printf("%.2f", quantity * 1.00);
                break;
            case "coke":
                System.out.printf("%.2f", quantity * 1.40);
                break;
            case "snacks":
                System.out.printf("%.2f", quantity * 2.00);
                break;
        }
    }
}
