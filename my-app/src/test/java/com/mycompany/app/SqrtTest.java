package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest
{
    private static final double DELTA = 0.0000001;

    @Test
    public void testSqrtOfZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfOne() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfFour() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfNine() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfTwoPointTwentyFive() {
        Sqrt sqrt = new Sqrt(2.25);
        assertEquals(1.5, sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfLargeNumber() {
        Sqrt sqrt = new Sqrt(1000000);
        assertEquals(1000.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testAverageOfTwoNumbers() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(5.0, sqrt.average(0, 10), DELTA);
    }

    @Test
    public void testGoodApproximation() {
        Sqrt sqrt = new Sqrt(0);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void testBadApproximation() {
        Sqrt sqrt = new Sqrt(0);
        assertFalse(sqrt.good(1.5, 4.0));
    }
}