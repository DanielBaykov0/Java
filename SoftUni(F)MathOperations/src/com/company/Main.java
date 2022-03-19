package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(Main.calculate(a, command, b));

    }

    private static double calculate(int a, String command, int b) {
        double result = 0.0;

        switch (command) {
            case "/":
                result = (double) a / b;
                break;
            case "-":
                result = a - b;
                break;
            case "+":
                result = a + b;
                break;
            case "*":
                result = a * b;
                break;
        }

        return result;
    }
}
