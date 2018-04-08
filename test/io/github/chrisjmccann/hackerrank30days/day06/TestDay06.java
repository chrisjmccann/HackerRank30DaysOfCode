package io.github.chrisjmccann.hackerrank30days.day06;

import io.github.chrisjmccann.hackerrank30days.common.TestSolutionBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDay06 extends TestSolutionBase {

    /*  With day 6, decided to stop copy/pasting private methods in each day's
        test classes - so moved these to an abstract class.  Because all
        of our solutions are static methods, we're passing in the class and
        main() will be called using reflection.
     */

    private Class classUnderTest =
            io.github.chrisjmccann.hackerrank30days.day06.Solution.class;

    @Test
    public void testHackerAndRank() {

        String[] inputLines = {"2", "Hacker", "Rank"};

        String result = testSolution(classUnderTest, inputLines);

        String[] resultSplit = result.split("\r\n");

        assertEquals(resultSplit.length, 2);

        assertEquals(resultSplit[0], "Hce akr");
        assertEquals(resultSplit[1], "Rn ak" );
    }

    @Test
    public void testStringsWithSpaces() {

        String[] inputLines = {"2", "Hacker Rank", "Rank Hacker"};

        String result = testSolution(classUnderTest, inputLines);

        String[] resultSplit = result.split("\r\n");

        assertEquals(resultSplit.length, 2);

        assertEquals(resultSplit[0], "Hce ak akrRn");
        assertEquals(resultSplit[1], "Rn akr akHce" );
    }

}
