package io.github.chrisjmccann.hackerrank30days.day11;

import io.github.chrisjmccann.hackerrank30days.common.TestSolutionBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDay11 extends TestSolutionBase {

    private Class classUnderTest =
            io.github.chrisjmccann.hackerrank30days.day11.Solution.class;

    @Test
    public void Test1() {

        String[] inputLines = {
                "1 1 1 0 0 0",
                "0 1 0 0 0 0",
                "1 1 1 0 0 0",
                "0 0 2 4 4 0",
                "0 0 0 2 0 0",
                "0 0 1 2 4 0" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "19" + "\r\n");
    }

    @Test
    public void Test2() {

        String[] inputLines = {
                "0 1 2 3 4 5",
                "1 2 3 4 5 6",
                "2 3 4 5 6 7",
                "3 4 5 6 7 8",
                "4 5 6 7 8 9",
                "5 6 7 8 9 9"};

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "55" + "\r\n");
    }

    @Test
    public void Test3() {

        String[] inputLines = {
                "1 9 1 0 0 0",
                "0 8 0 0 0 0",
                "7 1 1 0 0 0",
                "0 0 2 4 4 0",
                "0 0 0 2 0 0",
                "0 0 1 2 4 0" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "28" + "\r\n");
    }

    @Test
    public void Test4() {

        String[] inputLines = {
                "1 9 1 0 0 0",
                "0 -8 0 0 0 0",
                "-7 1 1 0 0 0",
                "0 0 2 4 -4 0",
                "0 0 0 2 0 0",
                "0 0 1 2 4 0" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "12" + "\r\n");
    }

    @Test
    public void TestNegativeMax() {

        String[] inputLines = {
                "-1 -9 -1 0 -2 0",
                "0 -8 0 0 -1 0",
                "-7 1 -1 0 -4 -3",
                "0 0 2 -4 -4 0",
                "0 -8 0 2 0 0",
                "0 -1 1 -9 -4 0" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "-4" + "\r\n");
    }

}
