package com.company;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                Main.add(a, b);
                break;
            case "multiply":
                Main.multiply(a, b);
                break;
            case "subtract":
                Main.subtract(a, b);
                break;
            case "divide":
                Main.divide(a, b);
                break;
        }

    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
