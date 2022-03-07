package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        int stepsCounter = 0;
        String command = scanner.nextLine();

        while (!command.equals("Going home")) {
            stepsCounter += Integer.parseInt(command);

            if (stepsCounter >= goal) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", stepsCounter - goal);
                break;
            }
            command = scanner.nextLine();
        }

        if (command.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            stepsCounter += stepsToHome;

            if (stepsCounter < goal) {
                System.out.printf("%d more steps to reach goal.", goal - stepsCounter);
            }
            else {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", stepsCounter - goal);
            }
        }
    }
}