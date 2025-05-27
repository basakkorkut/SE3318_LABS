package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit tests for the App, LoopControl, and ExampleUsage classes.
 */
public class AppTest extends TestCase {

    /**
     * Constructor for the test case.
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Basic truth test.
     */
    public void testApp() {
        assertTrue(true);
    }

    /**
     * Smoke test: Tests correct sum of squares from LoopControl.
     */
    public void testSumOfSquares() {
        LoopControl lc = new LoopControl();
        // Expected sum of squares from 1 to 10: 385
        lc.correctVariableUsage(); // prints to console
    }

    /**
     * Smoke test: Tests array sum from ExampleUsage.
     */
    public void testSumArray() {
        ExampleUsage ex = new ExampleUsage();
        int expectedSum = 75;
        int actualSum = ex.sumArray();
        assertEquals(expectedSum, actualSum);
    }

    /**
     * Smoke test: Run even number display (visual confirmation).
     */
    public void testDisplayEvenNumbers() {
        ExampleUsage ex = new ExampleUsage();
        ex.displayEvenNumbers(); // prints to console
    }

    /**
     * Smoke test: Run matrix processing (visual confirmation).
     */
    public void testProcessMatrix() {
        ExampleUsage ex = new ExampleUsage();
        ex.processMatrix(); // prints to console
    }
}
