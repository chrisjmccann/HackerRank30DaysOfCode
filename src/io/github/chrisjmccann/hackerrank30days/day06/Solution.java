package io.github.chrisjmccann.hackerrank30days.day06;
//comment out package when uploading so it will run

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        int iterations = inputScanner.nextInt();
        inputScanner.nextLine();
        String inputLine;

        for (int i = 0; i < iterations; i++) {

            //reading the line so this works even if string contains spaces
            //instructions weren't specific about this
            inputLine = inputScanner.nextLine().replace("\n", "");

            System.out.println(evenChars(inputLine) + " " + oddChars(inputLine));
        }
    }

    private static String evenChars(String input) {

        StringBuilder result = new StringBuilder();

        for (int index = 0; index < input.length(); index += 2) {
            result.append(input.charAt(index));
        }

        return result.toString();
    }

    private static String oddChars(String input) {

        StringBuilder result = new StringBuilder();

        for (int index = 1; index < input.length(); index += 2) {
            result.append(input.charAt(index));
        }

        return result.toString();
    }
}
