package io.github.chrisjmccann.hackerrank30days.day07;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] input = getInput();

        int[] reversed = reverse(input);

        System.out.println(arrayJoin(" ", reversed));
    }

    private static int[] getInput() {

        Scanner in = new Scanner(System.in);

        int inputElementCount = in.nextInt();
        int[] inputElements = new int[inputElementCount];

         for (int index = 0; index < inputElementCount; index++) {
            if (in.hasNextInt()) {
                inputElements[index] = in.nextInt();
            } else {
                System.out.println("Missing element # " + (index + 1));
            }
        }

        in.close();

        return inputElements;
    }

    private static int[] reverse(int[] input) {

        int[] reversed = new int[input.length];

        for (int index = 0; index < input.length; index++) {
            reversed[reversed.length - index - 1] = input[index];
        }

        return reversed;
    }

    private static String arrayJoin(String delimiter, int[] input) {

        StringBuilder result = new StringBuilder();

        if (input.length > 0) {
            result.append(input[0]);
        }

        for (int index = 1; index < input.length; index++) {
            result.append(delimiter);
            result.append(input[index]);
        }

      return result.toString();
    }
}