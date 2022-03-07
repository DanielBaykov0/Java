package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double cost = 0;

        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                cost = amount * 0.5;
            } else if (product.equals("water")) {
                cost = amount * 0.8;
            } else if (product.equals("beer")) {
                cost = amount * 1.2;
            } else if (product.equals("sweets")) {
                cost = amount * 1.45;
            } else if (product.equals("peanuts")) {
                cost = amount * 1.6;
            }
        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                cost = amount * 0.4;
            } else if (product.equals("water")) {
                cost = amount * 0.7;
            } else if (product.equals("beer")) {
                cost = amount * 1.15;
            } else if (product.equals("sweets")) {
                cost = amount * 1.3;
            } else if (product.equals("peanuts")) {
                cost = amount * 1.5;
            }
        } else if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                cost = amount * 0.45;
            } else if (product.equals("water")) {
                cost = amount * 0.7;
            } else if (product.equals("beer")) {
                cost = amount * 1.1;
            } else if (product.equals("sweets")) {
                cost = amount * 1.35;
            } else if (product.equals("peanuts")) {
                cost = amount * 1.55;
            }
        }
        System.out.println(cost);
    }
}
