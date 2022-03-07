package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;

        for (int i = 1; i <= groupsCount; i++){
            int peoplePerGroup = Integer.parseInt(scanner.nextLine());
            sum += peoplePerGroup;

            if (peoplePerGroup < 6) {
                musala += peoplePerGroup;
            }else if (peoplePerGroup < 13) {
                monblan += peoplePerGroup;
            }else if (peoplePerGroup < 26) {
                kilimandjaro += peoplePerGroup;
            }else if (peoplePerGroup < 41) {
                k2 += peoplePerGroup;
            }else {
                everest += peoplePerGroup;
            }
        }
        musala = musala / sum * 100;
        monblan = monblan / sum * 100;
        kilimandjaro = kilimandjaro / sum * 100;
        k2 = k2 / sum * 100;
        everest = everest / sum * 100;

        System.out.printf("%.2f%% \n", musala);
        System.out.printf("%.2f%% \n", monblan);
        System.out.printf("%.2f%% \n", kilimandjaro);
        System.out.printf("%.2f%% \n", k2);
        System.out.printf("%.2f%%", everest);
    }
}
