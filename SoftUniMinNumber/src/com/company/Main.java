package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int min = Integer.MAX_VALUE;

        while (!number.equals("Stop")) {
            int n = Integer.parseInt(number);

            if (n < min) {
                min = n;
            }
            number = scanner.nextLine();
        }
        System.out.println(min);
    }
}
