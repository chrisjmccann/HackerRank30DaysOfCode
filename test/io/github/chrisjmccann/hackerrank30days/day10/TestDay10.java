package io.github.chrisjmccann.hackerrank30days.day10;

import io.github.chrisjmccann.hackerrank30days.common.TestSolutionBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDay10 extends TestSolutionBase {

    private Class classUnderTest =
            io.github.chrisjmccann.hackerrank30days.day10.Solution.class;

    @Test
    public void Test5() {

        String[] inputLines = { "5" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "1" + "\r\n");

    }

    @Test
    public void Test13() {

        String[] inputLines = { "13" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "2" + "\r\n");

    }

    /*  I was in a hurry and got lazy, only wrote tests for 5 and 3, but
        failed because I didn't account for 1, so added min and max tests
     */
    @Test
    public void TestMin() {

        String[] inputLines = { "1" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "1" + "\r\n");

    }

    @Test
    public void TestMax() {

        String[] inputLines = { "1000000" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "4" + "\r\n");

    }
}
