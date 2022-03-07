package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videocardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double videocard = 250;
        double videocardPrice = videocardsCount * videocard;
        double cpu = videocardPrice * 0.35;
        double ram = videocardPrice * 0.1;
        double cpuPrice = processorsCount * cpu;
        double ramPrice = ram * ramCount;
        double finalSum = videocardPrice + cpuPrice + ramPrice;

        if (videocardsCount > processorsCount) {
            finalSum = finalSum - (finalSum * 0.15);
        }

        if (budget >= finalSum) {
            System.out.printf("You have %.2f leva left!", budget - finalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", finalSum - budget);
        }

    }
}
