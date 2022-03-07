package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double savedMoney = 0;

        while (!"End".equals(input)){
            double minimalBudget = Double.parseDouble(scanner.nextLine());
            while (savedMoney < minimalBudget){
                double money = Double.parseDouble(scanner.nextLine());
                savedMoney = savedMoney + money;
            }
            System.out.printf("Going to %s!%n", input);
            savedMoney = 0;
            input = scanner.nextLine();
        }
    }
}

