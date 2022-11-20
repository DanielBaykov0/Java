package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());
        int examTime = (examHour * 60) + examMinute;
        int arrivalTime = (arrivalHour * 60) + arrivalMinute;
        int difference = examTime - arrivalTime;

        if (difference > 30){
            System.out.println("Early");

            if (difference > 59){
                int hours = difference / 60;
                int mins = difference % 60;
                System.out.printf("%d:%02d hours before the start", hours, mins);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        } else if (difference < 0){
            System.out.println("Late");
            int minsLate = Math.abs(difference);
            if (minsLate > 59){
                int hours = minsLate / 60;
                int mins = minsLate % 60;
                System.out.printf("%d:%02d hours after the start", hours, mins);
            } else {
                System.out.printf("%d minutes after the start", minsLate);
            }
        } else {
            System.out.println("On time");
            if (difference > 0) {
                System.out.printf("%d minutes before the start", difference);
            }
        }
    }
}
