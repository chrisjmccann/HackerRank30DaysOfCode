package io.github.chrisjmccann.hackerrank30days.day09;

import io.github.chrisjmccann.hackerrank30days.common.TestSolutionBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDay09 extends TestSolutionBase {

    private Class classUnderTest =
            io.github.chrisjmccann.hackerrank30days.day09.Solution.class;

    @Test
    public void testValid3() {

        String[] inputLines = { "3" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "6" + "\r\n");
    }

    @Test
    public void testValid2() {

        String[] inputLines = { "2" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "2" + "\r\n");
    }

    @Test
    public void testValidMax() {

        String[] inputLines = { "12" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "479001600" + "\r\n");
    }

    @Test
    public void testValidMin() {

        String[] inputLines = { "1" };

        String result = testSolution(classUnderTest, inputLines);

        assertEquals(result, "1" + "\r\n");
    }

    /*  Today, reworked the exception handling on the base class so
        we can use the expectedException annotation - had to catch
        and re-throw inner exception because of reflection
     */
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidZero() {

        String[] inputLines = { "0" };

        String result = testSolution(classUnderTest, inputLines);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidNegative() {

        String[] inputLines = { "-1" };

        String result = testSolution(classUnderTest, inputLines);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalid13() {

        String[] inputLines = { "13" };

        String result = testSolution(classUnderTest, inputLines);
    }

    @Test(expectedExceptions = java.util.InputMismatchException.class)
    public void testInvalidChar() {

        String[] inputLines = { "foo" };

        String result = testSolution(classUnderTest, inputLines);
    }
}
