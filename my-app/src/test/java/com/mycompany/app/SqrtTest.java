package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest
{
    private static final double DELTA = 0.00001;

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
    public void testSqrtOfSixteen() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfTwo() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfThree() {
        Sqrt sqrt = new Sqrt(3.0);
        assertEquals(Math.sqrt(3.0), sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfTen() {
        Sqrt sqrt = new Sqrt(10.0);
        assertEquals(Math.sqrt(10.0), sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfTwentyFive() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfFifty() {
        Sqrt sqrt = new Sqrt(50.0);
        assertEquals(Math.sqrt(50.0), sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfLargeNumber() {
        Sqrt sqrt = new Sqrt(1_000_000.0);
        assertEquals(1000.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfVerySmallNumber() {
        Sqrt sqrt = new Sqrt(0.0000001);
        assertEquals(Math.sqrt(0.0000001), sqrt.calc(), DELTA);
    }
}