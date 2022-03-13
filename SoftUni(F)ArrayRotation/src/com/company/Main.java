package com.company;

import org.w3c.dom.Text;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations ; i++) {
            int firstNum = array[0];
            for (int j = 0; j < array.length-1; j++) {
                array[j] = array[j+1];
            }

            array[array.length - 1] = firstNum;
        }

        System.out.print(Arrays.toString(array));

    }
}
