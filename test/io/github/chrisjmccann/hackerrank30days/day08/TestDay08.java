package io.github.chrisjmccann.hackerrank30days.day08;

import io.github.chrisjmccann.hackerrank30days.common.TestSolutionBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDay08 extends TestSolutionBase {

    private Class classUnderTest =
            io.github.chrisjmccann.hackerrank30days.day08.Solution.class;

    @Test
    public void testGiven() {

        String[] inputLines = {
                "3",
                "sam 99912222",
                "tom 11122222",
                "harry 12299933",
                "sam",
                "edward",
                "harry"};

        String result = testSolution(classUnderTest, inputLines);

        String[] resultLines = result.split("\r\n");

        assertEquals(resultLines.length, 3);

        assertEquals(resultLines[0], "sam=99912222");
        assertEquals(resultLines[1], "Not found");
        assertEquals(resultLines[2], "harry=12299933");
    }

    @Test
    public void testPhoneBookTooShort() {

        String[] inputLines = {
                "4",
                "sam 99912222",
                "tom 11122222",
                "harry 12299933",
                "sam",
                "edward",
                "harry"};

        String result = testSolution(classUnderTest, inputLines);

        String[] resultLines = result.split("\r\n");

        assertEquals(resultLines[0], "Wrong phonebook entry format: sam");
        assertEquals(resultLines[1], "Not found");
        assertEquals(resultLines[2], "harry=12299933");

        assertEquals(resultLines.length, 3);
    }

    @Test
    public void testPhoneBookTooLong() {

        String[] inputLines = {
                "2",
                "sam 99912222",
                "tom 11122222",
                "harry 12299933",
                "sam",
                "edward",
                "tom"};

        String result = testSolution(classUnderTest, inputLines);

        String[] resultLines = result.split("\r\n");

        assertEquals(resultLines[0], "Not found");
        assertEquals(resultLines[1], "sam=99912222");
        assertEquals(resultLines[2], "Not found");
        assertEquals(resultLines[3], "tom=11122222");

        assertEquals(resultLines.length, 4);
    }

    @Test
    public void testPhoneBookLineExtraField() {

        String[] inputLines = {
                "2",
                "sam 99912222 foo",
                "tom 11122222",
                "sam"};

        String result = testSolution(classUnderTest, inputLines);

        String[] resultLines = result.split("\r\n");

        assertEquals(resultLines[0], "Wrong phonebook entry format: sam 99912222 foo");
        assertEquals(resultLines[1], "Not found");

        assertEquals(resultLines.length, 2);
    }

    @Test
    public void testPhoneBookLineDuplicate() {

        String[] inputLines = {
                "3",
                "sam 99912222",
                "sam 86473842",  //will overwrite sam
                "tom 11122222",
                "sam"};

        String result = testSolution(classUnderTest, inputLines);

        String[] resultLines = result.split("\r\n");

        assertEquals(resultLines[0], "sam=86473842");

        assertEquals(resultLines.length, 1);
    }
}
