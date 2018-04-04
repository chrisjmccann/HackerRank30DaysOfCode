package io.github.chrisjmccann.hackerrank30days.day02;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        solve(System.in);
    }

    public static void solve(java.io.InputStream inputStream) {

        Scanner in = new Scanner(inputStream);
        double mealCost = in.nextDouble();
        int tipPercent = in.nextInt();
        int taxPercent = in.nextInt();
        in.close();

        double tipAmount = mealCost * (tipPercent / 100.0f);
        double taxAmount = mealCost * (taxPercent / 100.0f);
        double totalCost = mealCost + tipAmount + taxAmount;

        long totalCostWholeDollars = Math.round(totalCost);

        System.out.println(String.format("The total meal cost is %d dollars.", totalCostWholeDollars));

    }
}