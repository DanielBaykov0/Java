package com.company;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String word = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        System.out.println(Main.repeatWord(word,repeat));
        

    }
    
    private static String repeatWord(String word, int repeat) {
        String result = "";
        for (int i = 0; i < repeat ; i++) {
            result = word.repeat(repeat);
        }

        return result;
    }

    
}
