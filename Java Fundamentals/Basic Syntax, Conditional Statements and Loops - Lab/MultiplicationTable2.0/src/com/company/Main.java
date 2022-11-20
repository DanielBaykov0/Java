package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int multi = Integer.parseInt(scanner.nextLine());

        for (int i = multi; i <= 10 ; i++) {
                System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}
