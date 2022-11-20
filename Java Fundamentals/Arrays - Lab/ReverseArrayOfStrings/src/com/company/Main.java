package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] words = scanner.nextLine().split(" ");

        for (int i = words.length - 1; i >= 0 ; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
