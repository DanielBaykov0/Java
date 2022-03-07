package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        boolean isAnAlien = false;
        if (isAnAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int topScores = 100;
        if (topScores != 100) {
            System.out.println("You got the high scores!");
        }

        int topScoress = 100;
        if (topScoress > 100) {
            System.out.println("You got the high score!");
        }

        int topScoresss = 100;
        if (topScoresss >= 100) {
            System.out.println("You got the high score!");
        }

        int topScorees = 100;
        if (topScorees < 100) {
            System.out.println("You got the high score!");
        }

        int topScoreess = 100;
        if (topScoreess <= 100) {
            System.out.println("You got the high score!");
        }

        int topScoreees = 80;
        if (topScoreees < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScoreees > secondTopScore) && (topScoreees < 100)) { // && logical "and" operator
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScoreees > 90) || (secondTopScore <= 90)) { // || logical "or" operator
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue  == 50) { // only double "==", doesn't work with a single one "="
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) { // "!" is a NOT operator. (isCar) tests for true, (!isCar) tests for false
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }


        double numberOne = 20.00d;
        double numberTwo = 80.00d;
        double sum = (numberOne + numberTwo) * 100.00d;
        System.out.println("The sum is = " + sum);
        double remainder = sum % 40.00d;
        System.out.println("the remainder is = " + remainder);
        boolean remainderOne = (remainder == 0) ? true : false;
        System.out.println("remainderOne is = " + remainderOne);
        if (!remainderOne) {
            System.out.println("GOT IT");
        }










    }
}
