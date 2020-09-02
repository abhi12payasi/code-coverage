package com.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testCalMoreThanTen() {
        App app = new App();
        double number = 11;
        assertEquals(Math.log(number), app.cal(number), 0.001);
    }

    @Test
    public void testCalLessThanTen() {
        App app = new App();
        double number = 9;
        assertEquals(Math.tan(number), app.cal(number), 0.001);
    }
}
