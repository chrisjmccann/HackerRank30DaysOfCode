package io.github.chrisjmccann.hackerrank30days.day07;

import io.github.chrisjmccann.hackerrank30days.common.TestSolutionBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDay07 extends TestSolutionBase {

    private Class classUnderTest =
            io.github.chrisjmccann.hackerrank30days.day07.Solution.class;

    @Test
    public void test1432() {

        String[] inputLines = {"4", "1 4 3 2"};

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "2 3 4 1" + "\r\n");
    }

    @Test
    public void testBiggerNumbers() {

        String[] inputLines = {"11", "188 587 2 654 68354448 46478 121 1 -1 56 0"};

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "0 56 -1 1 121 46478 68354448 654 2 587 188" + "\r\n");
    }

    @Test
    public void testTooManyInts() {

        String[] inputLines = {"5", "1 4 3 2 5 7"};

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "5 2 3 4 1" + "\r\n");
    }

    @Test
    public void testNotEnoughInts() {

        String[] inputLines = {"7", "1 4 3 2 5 7"};

        String result = testSolution(classUnderTest, inputLines);

        String[] resultSplit = result.split("\r\n");

        assertEquals(resultSplit.length, 2);
        assertEquals(resultSplit[0], "Missing element # 7");
        assertEquals(resultSplit[1], "0 7 5 2 3 4 1");
    }
}
