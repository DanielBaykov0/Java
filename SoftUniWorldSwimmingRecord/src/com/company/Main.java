package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());
        double swimSeconds = distanceInMeters * timeInSeconds;
        double addSeconds = distanceInMeters / 15;
        addSeconds = Math.floor(addSeconds) * 12.5;
        double finalTime = swimSeconds + addSeconds;

        if (finalTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", (finalTime));
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (finalTime - recordInSeconds));
        }
    }
}
