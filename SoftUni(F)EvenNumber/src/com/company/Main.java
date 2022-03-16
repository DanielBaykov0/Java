package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int n = Math.abs(Integer.parseInt(scanner.nextLine()));

            if (n % 2 != 0) {
                System.out.println("Please write an odd number.");
            } else {
                System.out.println("The number is: " + n);
                break;
            }
        }
    }
}
