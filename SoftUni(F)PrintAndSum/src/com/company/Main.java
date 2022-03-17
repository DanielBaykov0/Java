package com.company;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = first; i <=second ; i++) {
            sum += i;
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
