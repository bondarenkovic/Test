package com.company.task4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The type Task 4.
 */
public class Task4 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("Please input any sentence:");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        System.out.println("Please input any word:");
        String word = in.nextLine();
        System.out.println("Word " + word + " can be found in text for " + contain(sentence, word) + " times");
    }

    private static long contain(String s, String w) {
        s = s.replaceAll("[^A-Za-zА-Яа-яё\\s]", "");
        return Arrays.stream(s.split("\\s+"))
                .filter(w::equalsIgnoreCase)
                .count();
    }
}
