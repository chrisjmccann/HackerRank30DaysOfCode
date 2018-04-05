package io.github.chrisjmccann.hackerrank30days.day04;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;

public class TestDay04 {

    private final ByteArrayOutputStream stdOutContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(stdOutContent);

    @BeforeClass
    public void setUp() {
        System.setOut(printStream);
    }

    @Test
    public void testGiven() {

        String result = testSolution(
                "4" + "\n" +
                "-1"    + "\n" +
                "10"    + "\n" +
                "16"    + "\n" +
                "18"    + "\n" );

        // this is just too ugly, so will split the lines instead
        // and assert them one at a time
        /* assertEquals(result,
                "Age is not valid, setting age to 0." + "\r\n" +
                "You are young." + "\r\n" +
                "You are young." + "\r\n" +
                "\r\n" +
                "You are young." + "\r\n" +
                "You are a teenager." + "\r\n" +
                "\r\n" +
                "You are a teenager." + "\r\n" +
                "You are old." + "\r\n" +
                "\r\n" +
                "You are old." + "\r\n" +
                "You are old." + "\r\n" +
                "\r\n");
        */

        String[] resultSplit = result.split("\r\n");

        assertEquals(resultSplit.length, 12);
        assertEquals(resultSplit[0], "Age is not valid, setting age to 0.");
        assertEquals(resultSplit[1], "You are young." );
        assertEquals(resultSplit[2], "You are young." );
        assertEquals(resultSplit[3], "" );
        assertEquals(resultSplit[4], "You are young." );
        assertEquals(resultSplit[5], "You are a teenager." );
        assertEquals(resultSplit[6], "" );
        assertEquals(resultSplit[7], "You are a teenager." );
        assertEquals(resultSplit[8], "You are old." );
        assertEquals(resultSplit[9], "" );
        assertEquals(resultSplit[10], "You are old." );
        assertEquals(resultSplit[11], "You are old." );

    }

    @Test
    public void testOneMore() {

        String result = testSolution(
                "1" + "\n" +
                        "40"    + "\n" );

        String[] resultSplit = result.split("\r\n");

        assertEquals(resultSplit.length, 2);
        assertEquals(resultSplit[0], "You are old.");
        assertEquals(resultSplit[1], "You are old." );
    }

    private String testSolution(String testInput) {

        try (InputStream inputStream =
                     new ByteArrayInputStream(testInput.getBytes())) {

            Person.solve(inputStream);

            String result = stdOutContent.toString();
            stdOutContent.reset();

            return result;

        } catch (java.io.IOException e) {
            Assert.fail("poop", e);
        }

        return "";
    }

    @AfterClass
    public void tearDown() {
        System.setOut(System.out);
    }

}
