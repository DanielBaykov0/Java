package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double sum = 0;

        if(symbol.equals("+")) {
            sum = n1 + n2;
            if (sum % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", n1, symbol, n2, sum);
            }else {
                System.out.printf("%d %s %d = %.0f - odd", n1, symbol, n2, sum);
            }
        }else if (symbol.equals("-")) {
            sum = n1 - n2;
            if (sum % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", n1, symbol, n2, sum);
            }else {
                System.out.printf("%d %s %d = %.0f - odd", n1, symbol, n2, sum);
            }
        }else if (symbol.equals("*")) {
            sum = n1 * n2;
            if (sum % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", n1, symbol, n2, sum);
            }else {
                System.out.printf("%d %s %d = %.0f - odd", n1, symbol, n2, sum);
            }
        }else if (symbol.equals("/")) {
            sum = (double)n1 / n2;
            if (n2 != 0) {
                System.out.printf("%d %s %d = %.2f", n1, symbol, n2, sum);
            }else {
                System.out.printf("Cannot divide %d by zero", n1);
            }
        }else if (symbol.equals("%")) {
            sum = (double)n1 % n2;
            if (n2 != 0) {
                System.out.printf("%d %s %d = %.0f", n1, symbol, n2, sum);
            }else {
                System.out.printf("Cannot divide %d by zero", n1);
            }
        }
    }
}
