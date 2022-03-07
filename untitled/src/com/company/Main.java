package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(reverse(123));
    }
    public static int reverse (int reversedNumber) {
        int reversed = 0;
        for (int iteration = 0; reversedNumber != 0; reversedNumber /= 10) {
            // 123 / 10 = 12
            int lastDigit = reversedNumber % 10;
            System.out.println("lastDigit is: " + lastDigit);
            // 123 % 10 = 3
            reversed = (reversed * 10) + lastDigit; // that's the tricky part - first time reverse is going to be equal to last digit because it is 0
            System.out.println("Iteration " + ++iteration + ", numberToBeReversed is: " + reversedNumber + "; reversed is: " + reversed);
            System.out.println("reversedNumber is going to be assinged a value of: " + reversedNumber / 10 + " beginning the next iteration");
        }
        return reversed;
    }

}
