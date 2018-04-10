package io.github.chrisjmccann.hackerrank30days.common;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

public abstract class TestSolutionBase {

    private PrintStream systemOut;
    private final ByteArrayOutputStream stdOutContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(stdOutContent);

    @BeforeClass
    public void setUp() {

        systemOut = System.out;
        System.setOut(printStream);

    }

    protected String testSolution(Class theClass, String[] inputLines) {

        redirectStdInWith(inputLines);

        runMainFrom(theClass);

        String result = stdOutContent.toString();
        stdOutContent.reset();

        return result;
    }

    private InputStream redirectStdInWith(String[] inputLines) {

        System.setIn(convertLinesToInputStream(inputLines));

        return System.in;
    }

    private InputStream convertLinesToInputStream(String[] inputLines) {

        StringBuilder input = new StringBuilder();

        for (String line : inputLines) {
            input.append(line);
            input.append("\n");
        }

        return new ByteArrayInputStream(input.toString().getBytes());
    }

    private void runMainFrom(Class<?> theClass) {

        Method mainMethod;
        String[] params = new String[] {""};

        try {

            mainMethod = theClass.getMethod("main", String[].class);
            mainMethod.invoke(null, (Object) params);

        } catch (NoSuchMethodException e) {
            Assert.fail("No Main method found", e);

        } catch (java.lang.IllegalAccessException e) {
            Assert.fail("poop reflect", e);

        } catch (java.lang.reflect.InvocationTargetException e) {

            if (e.getCause() instanceof RuntimeException) {
                //re-throw any inner runtime exception so we can use
                //expectedExceptions on our tests
                throw (RuntimeException) e.getCause();

            } else {
                Assert.fail("poop reflect", e);
            }
        }
    }

    @AfterClass
    public void tearDown() {
        System.setOut(systemOut);
    }


}
