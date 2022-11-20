package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int sum = length * width;
        int lastpiece = 0;
        String input = "";

        while (sum >= 0) {
            input = scanner.nextLine();

            if (input.equals("STOP")) {
                System.out.printf("%d pieces are left.", sum);
                break;
            } else {
                lastpiece = Integer.parseInt(input);
                sum -= lastpiece;
            }
        }

        if (!input.equals("STOP")) {
        System.out.println("No more cake left! You need " + Math.abs(sum) + " pieces more.");
        }
    }
}
