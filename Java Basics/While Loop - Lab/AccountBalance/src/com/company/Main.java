package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String money = (scanner.nextLine());
        double total = 0;

        while (!money.equals("NoMoreMoney")) {
            double n = Double.parseDouble(money);

            if (n < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            total += n;
            System.out.printf("Increase: %.2f \n", n);
            money = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}
