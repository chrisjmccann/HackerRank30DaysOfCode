package io.github.chrisjmccann.hackerrank30days.day03;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        solve(System.in);
    }

    public static void solve(InputStream inputStream) {

        int testNumber = readInt(inputStream);

        String weirdness = "";

        if(testNumber % 2 == 1) {
            weirdness = "Weird";

        } else {  //even numbers

            if (testNumber >= 2 && testNumber <= 5) {
                weirdness = "Not Weird";

            } else if (testNumber >= 6 && testNumber <= 20) {
                weirdness = "Weird";

            } else if (testNumber > 20) {
                weirdness = "Not Weird";
            }
        }

        System.out.println(weirdness);

    }

    private static int readInt(java.io.InputStream inputStream) {

        Scanner scan = new Scanner(inputStream);

        int n = scan.nextInt();

        scan.close();

        return n;
    }
}
