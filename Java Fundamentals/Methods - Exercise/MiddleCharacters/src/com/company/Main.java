package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        System.out.println(Main.getMiddleChar(command));
    }

    private static String getMiddleChar(String command) {
        int position;
        int length;
        if (command.length() % 2 == 0) {
            position = command.length() / 2 - 1;
            length = 2;
        } else {
            position = command.length() / 2;
            length = 1;
        }

        return command.substring(position, position + length);
    }
}
