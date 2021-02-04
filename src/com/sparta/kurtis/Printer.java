package com.sparta.kurtis;

import java.util.Arrays;

public class Printer {
    public static void printString(String message) {
        System.out.println(message);
    }

    public static void printIntArray(int[] numberArray) {
        System.out.print(Arrays.toString(numberArray));
    }

    public static void printErrorMessage(String message) {
        System.err.println(message);
    }
}
