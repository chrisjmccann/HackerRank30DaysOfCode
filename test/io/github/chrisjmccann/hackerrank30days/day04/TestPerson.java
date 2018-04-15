package io.github.chrisjmccann.hackerrank30days.day04;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.*;

public class TestPerson {

    /*  This test covers the Person class from Day 4 in a way that shows
        encapsulation.  The regular day 4 exercise calls Person.main(),
        which isn't how it works in real life.

        In this test, we'll test only the constructor, amIOld(),
        and yearPasses() methods, which is closer to what a unit test would do.

        Notice how we are prevented from accessing Person.age directly.
     */

    private final ByteArrayOutputStream stdOutContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(stdOutContent);

    @BeforeClass
    public void setUp() {
        System.setOut(printStream);
    }

    @Test
    public void testGrowUp() {

        Person person = new Person(17);

        person.amIOld();
        assertEquals(getStdOut(), "You are a teenager.\r\n");

        person.yearPasses();

        person.amIOld();
        assertEquals(getStdOut(), "You are old.\r\n");

    }

    @Test
    public void testMidlifeCrisis() {

        Person person = new Person(40);

        person.amIOld();
        assertEquals(getStdOut(), "You are old.\r\n");

        //MIDLIFE CRISIS - TRY TO GET YOUNGER
        //notice we are not allowed to access age
        //person.age = 17;

        //because we could not get younger, the following assertion would fail
        //person.amIOld();
        //assertEquals(getStdOut(), "You are a teenager.\r\n");

    }

    private String getStdOut() {
        String result = stdOutContent.toString();
        stdOutContent.reset();
        return result;
    }

    @AfterClass
    public void tearDown() {
        System.setOut(System.out);
    }

}
