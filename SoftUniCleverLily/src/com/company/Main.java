package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int reward = 10;
        int moneyCount = 0;
        int toys = 0;
        int sum = 0;


        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyCount += reward;
                moneyCount--;
                reward += 10;
            } else {
                toys++;
            }
        }
        sum = toys * toyPrice + moneyCount;
        if (sum >= laundryPrice) {
            System.out.printf("Yes! %.2f", (sum - laundryPrice));
        }else {
            System.out.printf("No! %.2f",(laundryPrice - sum));
        }
    }
}
