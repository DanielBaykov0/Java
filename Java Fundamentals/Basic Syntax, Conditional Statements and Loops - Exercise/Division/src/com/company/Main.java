package com.company;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());

        if (n % 10 == 0) {
            System.out.println("The number is divisible by " + "10");
        } else if (n % 7 == 0) {
            System.out.println("The number is divisible by " + "7");
        } else if (n % 6 == 0) {
            System.out.println("The number is divisible by " + "6");
        } else if (n % 3 == 0) {
            System.out.println("The number is divisible by " + "3");
        } else if (n % 2 == 0) {
            System.out.println("The number is divisible by " + "2");
        } else {
            System.out.println("Not divisible");
        }
    }
}
