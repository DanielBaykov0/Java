package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;

        for (int i = 0; i < numbers; i++) {
            int current = Integer.parseInt(scanner.nextLine());

            if (current > high) {
                high = current;
            }
            if (current < low) {
                low = current;
            }
        }
        System.out.println("Max number: " + high);
        System.out.println("Min number: " + low);
    }
}
