package io.github.chrisjmccann.hackerrank30days.day11;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[][] searchArray = readSearchArray(System.in);
        int maxHourglassSum = Integer.MIN_VALUE;

        //TODO calculate search area based on a shape template

        for (int i = 0; i < searchArray.length - 2; i++) {
            for (int j = 0; j < searchArray[i].length - 2; j++) {

                int hourglassSum = getHourglassSum(searchArray, i, j);

                if (hourglassSum > maxHourglassSum) {
                    maxHourglassSum = hourglassSum;
                }
            }
        }

        System.out.println(maxHourglassSum);
    }

    private static int[][] readSearchArray(InputStream inputStream) {

        Scanner scanner = new Scanner(inputStream);

        /*  to make this dynamic would be a little ridiculous because
            you can't resize an array - so would use an ArrayList.
            However, the point of this exercise is an array, so
            we'll just leave it & move on
         */

        int[][] searchArray = new int[6][6];

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                searchArray[i][j] = scanner.nextInt();
            }
        }

        return searchArray;
    }

    private static int getHourglassSum(int[][] searchArray, int startPosI, int startPosJ) {

        //TODO calculate based on a shape template

        int hourglassSum;

        hourglassSum = searchArray[startPosI][startPosJ]
                     + searchArray[startPosI][startPosJ + 1]
                     + searchArray[startPosI][startPosJ + 2];

        hourglassSum += searchArray[startPosI + 1][startPosJ + 1];

        hourglassSum += searchArray[startPosI + 2][startPosJ]
                      + searchArray[startPosI + 2][startPosJ + 1]
                      + searchArray[startPosI + 2][startPosJ + 2];

        return hourglassSum;
    }
}
