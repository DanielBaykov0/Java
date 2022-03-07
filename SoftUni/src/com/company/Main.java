package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one: square, rectangle, circle, triangle");
        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double length = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", length * length);
        }else if (figure.equals("rectangle")) {
            double one = Double.parseDouble(scanner.nextLine());
            double two = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", one * two);
        }else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", radius * radius * Math.PI);
        }else if (figure.equals("triangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (length * height) / 2);
        }

    }
}
