package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        System.out.println(getRectangleArea(width,height));


    }

    private static double getRectangleArea(double width, double height) {
        return (width * height);
    }
}
