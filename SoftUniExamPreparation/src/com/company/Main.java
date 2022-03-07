package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int badScore = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int solvedProblemsCount = 0;
        double gradeSum = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (failedTimes < badScore) {
            String problemName = scanner.nextLine();

            if (problemName.equals("Enough")) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                failedTimes++;
            }
            gradeSum += grade;
            solvedProblemsCount++;
            lastProblem = problemName;
        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badScore);
        } else {
            System.out.printf("Average score: %.2f%n", gradeSum / solvedProblemsCount);
            System.out.printf("Number of problems: %d%n", solvedProblemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
