package io.github.chrisjmccann.hackerrank30days.day08;

import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);

        Map<String, String> phoneBook = loadPhoneBook(input);

        while (input.hasNext()) {

            String queryName = input.next();

            printPhoneBookEntry(queryName, phoneBook, System.out);

            if (input.hasNext()) {
                input.nextLine();
            }
        }

        input.close();
    }

    private static Map<String, String> loadPhoneBook(Scanner input) {

        int inputElementCount = input.nextInt();
        input.nextLine();

        Map<String, String> phoneBook = new HashMap<>();

        for (int index = 0; index < inputElementCount; index++) {
            if (input.hasNext()) {

                String phoneBookLine = input.nextLine().replace("\n", "");
                String[] phoneBookLineSplit = phoneBookLine.split(" ");

                if (phoneBookLineSplit.length == 2) {
                    phoneBook.put(phoneBookLineSplit[0], phoneBookLineSplit[1]);

                } else {
                    System.out.println("Wrong phonebook entry format: " + phoneBookLine);
                }
            } else {
                System.out.println("Missing element # " + (index + 1));
            }
        }

        return phoneBook;
    }

    private static void printPhoneBookEntry(String queryName, Map<String, String> phoneBook, PrintStream printStream) {

        String phoneNumber = phoneBook.get(queryName);

        if (phoneNumber != null) {
            printStream.println(queryName + "=" + phoneNumber);
        } else {
            printStream.println("Not found");
        }
    }
}
