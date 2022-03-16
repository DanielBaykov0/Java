package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());
        mins += 30;

        if (mins > 59) {
            hours++;
            mins %= 60;
        }

        if (hours > 23) {
            hours %= 24;
        }

        System.out.printf("%d:%02d%n",hours, mins);
    }
}
