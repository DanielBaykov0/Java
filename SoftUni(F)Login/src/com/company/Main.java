package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(username);
        String reversed = stringBuilder.reverse().toString();
        int count = 0;

        while (true) {
            if (!password.equals(reversed)) {
                count++;
                if (count == 4) {
                    System.out.printf("User %s blocked!", username);
                    return;
                }

                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.printf("User %s logged in.", username);
                break;
            }

            password = scanner.nextLine();
        }
    }
}
