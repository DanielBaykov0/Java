package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(getSubtractThird(a, b, c));
    }

    private static int getSumOfFirstTwo(int a, int b) {
        return a + b;
    }

    private static int getSubtractThird(int a, int b, int c) {
        return getSumOfFirstTwo(a, b) - c;
    }

}
