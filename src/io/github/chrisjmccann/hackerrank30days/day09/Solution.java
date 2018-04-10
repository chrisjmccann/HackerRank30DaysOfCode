package io.github.chrisjmccann.hackerrank30days.day09;

import java.io.InputStream;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int input = readInput(System.in);

        System.out.println(factorial(input));
    }

    private static int readInput(InputStream inputStream) {

        try (Scanner scanner = new Scanner(inputStream)) {
            return scanner.nextInt();
        }
    }

    private static int factorial(int input) {

        if (!(input >= 1 && input <= 12)) {
            throw new IllegalArgumentException(String.format(
                    "factorial: input %d is not (2 <= n <= 12)",  input));
        }

        if (input == 1) {
            return 1;

        } else {
            return input * factorial(input - 1);
        }
    }
}
