package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        returnData(command);
    }

    private static void returnData(String command) {
        Scanner scanner = new Scanner(System.in);
        switch (command){
            case "int":
                int input = Integer.parseInt(scanner.nextLine());
                System.out.println(input * 2);
                break;
            case "real":
                double input2 = Double.parseDouble(scanner.nextLine());
                System.out.println(input2 * 1.5);
                break;
            case "string":
                String input3 = scanner.nextLine();
                System.out.println("$" + input3 + "$");
                break;
        }
    }
}
