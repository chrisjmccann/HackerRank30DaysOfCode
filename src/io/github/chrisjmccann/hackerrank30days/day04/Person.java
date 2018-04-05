package io.github.chrisjmccann.hackerrank30days.day04;

import java.io.*;
import java.util.*;

//---------------------------------------------------------------------

public class Person {
    private int age;

    public Person(int initialAge) {

        if (initialAge < 0) {

            age = 0;
            System.out.println("Age is not valid, setting age to 0.");

        } else {
            age = initialAge;
        }
    }

    public void amIOld() {

        if (age < 13) {
            System.out.println("You are young.");

        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");

        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }
//----------------------------------------------------------------------
    public static void main(String[] args) {
        solve(System.in);
    }

    public static void solve(InputStream inputStream) {
        Scanner sc = new Scanner(inputStream);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}