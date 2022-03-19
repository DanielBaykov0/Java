package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        switch (command) {
            case "int":
                int numOne = Integer.parseInt(scanner.nextLine());
                int numTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(Main.getMax(numOne, numTwo));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(Main.getMax(firstChar, secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(Main.getMax(firstString, secondString));
                break;
        }
    }

    private static int getMax(int numOne, int numTwo) {
        if (numOne > numTwo) {
            return numOne;
        }

        return numTwo;
    }

    private static char getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        }

        return secondChar;
    }

    private static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        }

        return secondString;
    }
}
