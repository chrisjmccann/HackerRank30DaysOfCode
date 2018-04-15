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
            //OMG I'M CRYING
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

        int countOfPeopleToProcess = sc.nextInt();

        for (int i = 0; i < countOfPeopleToProcess; i++) {

            int age = sc.nextInt();
            Person person = new Person(age);

            person.amIOld();

            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }

            person.amIOld();
            System.out.println();

            /*  A class like Person would not usually have a main() method.
                Instead, other objects would create Person objects and use
                them.  Those would only have access to the public methods
                of Person.

                With a main() method inside the Person class, we have access
                to things we shouldn't (like the private field age),
                and could do this:

                Person midlifeCrisis = new Person(40);
                midlifeCrisis.amIOld();
                midlifeCrisis.age = 17;
            */

        }
        sc.close();
    }
}