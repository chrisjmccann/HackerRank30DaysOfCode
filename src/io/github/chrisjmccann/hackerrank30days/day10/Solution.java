package io.github.chrisjmccann.hackerrank30days.day10;

import java.io.InputStream;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int input = readInput(System.in);

        String inputBinary = Integer.toBinaryString(input);

        System.out.println(maxContiguousCharCount(inputBinary, '1'));

    }

    private static int readInput(InputStream inputStream) {

        try (Scanner scanner = new Scanner(inputStream)) {
            return scanner.nextInt();
        }
    }

    private static int maxContiguousCharCount(String stringToSearch, char charToFind) {

        int contiguousCharCount = 0;
        int maxContiguousCharCount = 0;

        for (int index = 0; index < stringToSearch.length(); index++) {

            if (stringToSearch.charAt(index) == charToFind) {

                contiguousCharCount++;

            } else {

                if (contiguousCharCount > maxContiguousCharCount) {
                    maxContiguousCharCount = contiguousCharCount;
                }

                contiguousCharCount = 0;
            }
        }

        if (contiguousCharCount > maxContiguousCharCount) {
            maxContiguousCharCount = contiguousCharCount;
        }

        return maxContiguousCharCount;
    }
}
