package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int box = width * length * height;
        int cubicMeters = 0;
        String input = "";

        while (box >= 0) {
            input = scanner.nextLine();

            if (input.equals("Done")) {
                System.out.printf("%d Cubic meters left.", box);
                break;
            } else {
                cubicMeters = Integer.parseInt(input);
                box -= cubicMeters;
            }
        }

        if (!input.equals("Done")) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(box));
        }
    }
}
