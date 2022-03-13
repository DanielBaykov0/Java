package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value ->Integer.parseInt(value)).toArray();

        while (nums.length > 1) {
            int[] condensed = new int[nums.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                    condensed[i] = nums[i] + nums[i+1];
            }
            nums = condensed;
        }
        System.out.println(nums[0]);
    }
}
