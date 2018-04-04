package io.github.chrisjmccann.hackerrank30days.day02;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.*;

public class TestDay02 {

    private final ByteArrayOutputStream stdOutContent = new ByteArrayOutputStream();

    @BeforeClass
    public void setUp() {
        System.setOut(new PrintStream(stdOutContent));
    }

    @Test
    public void testMain() {

        // test data
        String testInput =
                "12.00" + "\n" +    //meal cost
                "20"    + "\n" +    //tip percent
                "8"     + "\n" ;    //tax percent

        // expected result
        int expectedTotal = 15;

        String resultString = "";

        try (InputStream inputStream = new ByteArrayInputStream(testInput.getBytes())) {

            Solution.solve(inputStream);

            resultString = stdOutContent.toString();

        } catch (java.io.IOException e) {
            Assert.fail("poop", e);
        }

        assertEquals(resultString,
                String.format("The total meal cost is %d dollars.\r\n", expectedTotal));
    }

    @AfterClass
    public void tearDown() {
        System.setOut(System.out);
    }
}