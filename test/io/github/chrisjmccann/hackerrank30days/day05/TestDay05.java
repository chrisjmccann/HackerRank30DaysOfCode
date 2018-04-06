package io.github.chrisjmccann.hackerrank30days.day05;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;

public class TestDay05 {

    private PrintStream systemOut;
    private final ByteArrayOutputStream stdOutContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(stdOutContent);

    @BeforeClass
    public void setUp() {
        systemOut = System.out;
        System.setOut(printStream);
    }

    @Test
    public void test2() {
        String result = testSolution("2");

        String[] resultSplit = result.split("\r\n");

        assertEquals(resultSplit.length, 10);
        assertEquals(resultSplit[0], "2 x 1 = 2");
        assertEquals(resultSplit[1], "2 x 2 = 4" );
        assertEquals(resultSplit[2], "2 x 3 = 6" );
        assertEquals(resultSplit[3], "2 x 4 = 8" );
        assertEquals(resultSplit[4], "2 x 5 = 10" );
        assertEquals(resultSplit[5], "2 x 6 = 12" );
        assertEquals(resultSplit[6], "2 x 7 = 14" );
        assertEquals(resultSplit[7], "2 x 8 = 16" );
        assertEquals(resultSplit[8], "2 x 9 = 18" );
        assertEquals(resultSplit[9], "2 x 10 = 20" );
    }

    @Test
    public void test20() {
        String result = testSolution("20");

        String[] resultSplit = result.split("\r\n");

        assertEquals(resultSplit.length, 10);
        assertEquals(resultSplit[0], "20 x 1 = 20");
        assertEquals(resultSplit[1], "20 x 2 = 40" );
        assertEquals(resultSplit[2], "20 x 3 = 60" );
        assertEquals(resultSplit[3], "20 x 4 = 80" );
        assertEquals(resultSplit[4], "20 x 5 = 100" );
        assertEquals(resultSplit[5], "20 x 6 = 120" );
        assertEquals(resultSplit[6], "20 x 7 = 140" );
        assertEquals(resultSplit[7], "20 x 8 = 160" );
        assertEquals(resultSplit[8], "20 x 9 = 180" );
        assertEquals(resultSplit[9], "20 x 10 = 200" );
    }

    private String testSolution(String testInput) {

        try (InputStream inputStream =
                     new ByteArrayInputStream(testInput.getBytes())) {

            System.setIn(inputStream);

            Solution.main(null);

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
        System.setOut(systemOut);
    }

}
