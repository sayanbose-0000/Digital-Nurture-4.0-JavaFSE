// AAA - Arrange Act Assert

package com.example;

import org.example.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {
    Calculator c;

    @Before // runs before the test
    public void setup() {
        c = new Calculator();
        System.out.println("Test Initialized!");
    }

    @Test
    public void testAdd() {
        assertEquals(3, c.add(1,2));
    }

    @Test
    public void testSub() {
        assertEquals(1, c.sub(3,2));
    }

    @Test
    public void testMul() {
        assertEquals(2, c.mul(1,2));
    }

    @Test
    public void testDiv() {
        assertEquals(0, c.div(0,1));
    }

    @After // runs after the test
    public void teardown() {
        System.out.println("Test Complete!");
    }
}
