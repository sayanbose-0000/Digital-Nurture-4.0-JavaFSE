package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void sum1() {
        Main m = new Main();
        int res = m.sum(10, 20);
        assertEquals(30, res); // should pass
    }

    @Test
    public void sum2() {
        Main m = new Main();
        int res = m.sum(10, 20);
        assertEquals(50, res); // error should occur
    }
}