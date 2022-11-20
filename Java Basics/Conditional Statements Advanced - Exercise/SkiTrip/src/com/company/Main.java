package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();
        double sum = 0;

        if (room.equals("room for one person")) {
            sum = 18 * (days - 1);
            if (rating.equals("positive")) {
                sum = sum + (sum * 0.25);
            }else if (rating.equals("negative")) {
                sum = sum - (sum * 0.10);
            }
            System.out.printf("%.2f", sum);
        }else if (room.equals("apartment")) {
            sum = 25 * (days - 1);
            if (days < 10) {
                sum = sum - (sum * 0.30);
                if (rating.equals("positive")) {
                    sum = sum + (sum * 0.25);
                }else if (rating.equals("negative")) {
                    sum = sum - (sum * 0.10);
                }
            }else if (days >= 10 && days <=15) {
                sum = sum - (sum * 0.35);
                if (rating.equals("positive")) {
                    sum = sum + (sum * 0.25);
                }else if (rating.equals("negative")) {
                    sum = sum - (sum * 0.10);
                }
            }else {
                sum = sum - (sum * 0.50);
                if (rating.equals("positive")) {
                    sum = sum + (sum * 0.25);
                }else if (rating.equals("negative")) {
                    sum = sum - (sum * 0.10);
                }
            }
            System.out.printf("%.2f", sum);
        }else if (room.equals("president apartment")) {
            sum = 35 * (days - 1);
            if (days < 10) {
                sum = sum - (sum * 0.10);
                if (rating.equals("positive")) {
                    sum = sum + (sum * 0.25);
                }else if (rating.equals("negative")) {
                    sum = sum - (sum * 0.10);
                }
            }else if (days >= 10 && days <=15) {
                sum = sum - (sum * 0.15);
                if (rating.equals("positive")) {
                    sum = sum + (sum * 0.25);
                }else if (rating.equals("negative")) {
                    sum = sum - (sum * 0.10);
                }
            }else {
                sum = sum - (sum * 0.20);
                if (rating.equals("positive")) {
                    sum = sum + (sum * 0.25);
                }else if (rating.equals("negative")) {
                    sum = sum - (sum * 0.10);
                }
            }
            System.out.printf("%.2f", sum);
        }
    }
}
