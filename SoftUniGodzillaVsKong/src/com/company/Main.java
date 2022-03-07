package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double moviePrice = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble(scanner.nextLine());
        double decor = moviePrice * 0.1;
        double clothingPrice = statistsCount * pricePerStatist;

        if (statistsCount > 150) {
            clothingPrice = clothingPrice - (clothingPrice * 0.1);
        }

        double finalSum = clothingPrice + decor;

        if (finalSum > moviePrice) {
            System.out.printf("Not enough money! \n" +
                            "Wingard needs %.2f leva more.", (finalSum - moviePrice));
        } else if (finalSum <= moviePrice){
            System.out.printf("Action! \n" +
                            "Wingard starts filming with %.2f leva left.", (moviePrice - finalSum));
        }
    }
}
