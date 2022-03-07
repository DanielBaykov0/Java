package com.company;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        String name = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());
        double lunchTime = (double) breakTime / 8;
        double relaxTime = (double) breakTime / 4;
        double leftTime = (breakTime - lunchTime - relaxTime);

        if (leftTime >= episodeTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(leftTime-episodeTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name,
                            Math.ceil(episodeTime-leftTime));
        }
    }
}
