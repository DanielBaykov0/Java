package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = n;

        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
            sum += (2 * i);
        }

        System.out.printf("Sum: %d%n", sum);
    }
}
