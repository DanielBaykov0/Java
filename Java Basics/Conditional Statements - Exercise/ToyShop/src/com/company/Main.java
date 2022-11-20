package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double puzzle = 2.6;
        double talkingDoll = 3;
        double bear = 4.1;
        double mini = 8.2;
        double truck = 2;

        Scanner scanner = new Scanner(System.in);
        double travelPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int miniCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());
        int allToys = puzzleCount + dollCount + bearCount + miniCount + truckCount;
        double puzzlePrice = puzzle * puzzleCount;
        double dollPrice = talkingDoll * dollCount;
        double bearPrice = bear * bearCount;
        double miniPrice = mini * miniCount;
        double truckPrice = truck * truckCount;
        double allPrice = puzzlePrice + dollPrice + bearPrice + miniPrice + truckPrice;

        if (allToys >= 50) {
            allPrice = allPrice - (allPrice * 0.25);
        }
            double rent = allPrice * 0.1;
            double money = allPrice - rent;
        if (money > travelPrice) {
            System.out.printf("Yes! %.2f lv left.", (money - travelPrice));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", (travelPrice - money));
        }
    }
}
