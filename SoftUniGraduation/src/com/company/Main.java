package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = 1;
        int count = 1;
        double sum = 0;

        while (grade <= 12) {
            double n = Double.parseDouble(scanner.nextLine());

            if (n >= 4.00) {
                sum += n;
                grade++;
            } else {
                count++;
                if (count > 2) {
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    break;
                }
            }
        }
        if (grade >= 12) {
            double avgGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        }
    }
}
