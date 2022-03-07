package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int sleepsCount = Integer.parseInt(scanner.nextLine());
        double apartment = 0;
        double studio = 0;

        if (month.equals("May") || month.equals("October")) {
            studio = 50;
            apartment = 65;
            if (sleepsCount >= 8 && sleepsCount <= 14) {
                studio = studio - (studio * 0.05);
            }else if (sleepsCount >= 15) {
                studio = studio - (studio * 0.30);
                apartment = apartment - (apartment * 0.10);
            }
            System.out.printf("Apartment: %.2f lv. \n", (apartment * sleepsCount));
            System.out.printf("Studio: %.2f lv.", (studio * sleepsCount));
        }else if (month.equals("June") || month.equals("September")) {
            studio = 75.20;
            apartment = 68.70;
            if (sleepsCount >= 15) {
                studio = studio - (studio * 0.20);
                apartment = apartment - (apartment * 0.10);
            }
            System.out.printf("Apartment: %.2f lv. \n", (apartment * sleepsCount));
            System.out.printf("Studio: %.2f lv.", (studio * sleepsCount));
        }else if (month.equals("July") || month.equals("August")) {
            studio = 76;
            apartment = 77;
            if (sleepsCount >= 15) {
                apartment = apartment - (apartment * 0.10);
            }
            System.out.printf("Apartment: %.2f lv. \n", (apartment * sleepsCount));
            System.out.printf("Studio: %.2f lv.", (studio * sleepsCount));
        }
    }
}
