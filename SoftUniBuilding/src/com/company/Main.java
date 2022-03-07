package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        char symbol;

        for (int i = floors; i > 0; i--) {
            for (int j = 0; j < rooms; j++) {

                if (i == floors) {
                    symbol = 'L';
                } else if (i % 2 == 0) {
                    symbol = 'A';
                } else {
                    symbol = 'O';
                }
                System.out.printf("%c%d%d ",symbol, i, j);
            }
            System.out.printf("%n");
        }
    }
}
