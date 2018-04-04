package io.github.chrisjmccann.hackerrank30days.day03;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.*;

public class TestDay03 {

    private final ByteArrayOutputStream stdOutContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(stdOutContent);

    @BeforeClass
    public void setUp() {
        System.setOut(printStream);
    }

    @Test
    public void test3Weird() {

        String result = testSolution("3" + "\n");
        assertEquals(result, "Weird" + "\r\n");
    }

    @Test
    public void test24NotWeird() {

        // test data
        String result = testSolution("24" + "\n");
        assertEquals(result, "Not Weird" + "\r\n");
    }

    @Test
    public void testEven2To5() {

        String result = testSolution("4" + "\n");
        assertEquals(result, "Not Weird" + "\r\n");
    }

    @Test
    public void testEven2To5_LowerBound() {

        String result = testSolution("2" + "\n");
        assertEquals(result, "Not Weird" + "\r\n");
    }

    @Test
    public void testEven2To5_UpperBound() {

        String result = testSolution("4" + "\n");
        assertEquals(result, "Not Weird" + "\r\n");
    }

    @Test
    public void testOdd5() {

        String result = testSolution("5" + "\n");
        assertEquals(result, "Weird" + "\r\n");
    }

    @Test
    public void testEven6To20() {

        String result = testSolution("10" + "\n");
        assertEquals(result, "Weird" + "\r\n");
    }

    @Test
    public void testEven6To20_LowerBound() {

        String result = testSolution("6" + "\n");
        assertEquals(result, "Weird" + "\r\n");
    }

    @Test
    public void testEven6To20_UpperBound() {

        String result = testSolution("20" + "\n");
        assertEquals(result, "Weird" + "\r\n");
    }

    @Test
    public void testOdd21() {

        String result = testSolution("21" + "\n");
        assertEquals(result, "Weird" + "\r\n");
    }

    @Test
    public void testEvenGreaterThan20_LowerBound() {

        String result = testSolution("22" + "\n");
        assertEquals(result, "Not Weird" + "\r\n");
    }

    @Test
    public void testMin() {

        String result = testSolution("1" + "\n");
        assertEquals(result, "Weird" + "\r\n");
    }

    @Test
    public void testMax() {

        String result = testSolution("100" + "\n");
        assertEquals(result, "Not Weird" + "\r\n");
    }

    private String testSolution(String testInput) {

        try (InputStream inputStream = new ByteArrayInputStream(testInput.getBytes())) {

            Solution.solve(inputStream);

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