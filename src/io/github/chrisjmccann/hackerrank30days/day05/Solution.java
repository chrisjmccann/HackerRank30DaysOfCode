package io.github.chrisjmccann.hackerrank30days.day05;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        /*
         Hi - I simplified this for today - instead of the test passing
         an InputStream to our solution like day04, the test just sets
         standard input to an InputStream within the test,
         so our solution can just read from System.in
         like HackerRank expects
         */

        Scanner in = new Scanner(System.in);
        int baseNumber = in.nextInt();

        for (int multiplier = 1; multiplier <= 10; multiplier++) {

            int multiple = baseNumber * multiplier;

            String outputLine = String.format("%d x %d = %d",
                    baseNumber, multiplier, multiple);

            System.out.println(outputLine);
        }
    }
}