package com.company;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());

        int[] people = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {

            people[i] = Integer.parseInt(scanner.nextLine());

            System.out.print(people[i] + " ");

            sum += people[i];

        }
        System.out.println();
        System.out.println(sum);
    }
}
