package com.conology;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c = new Calculator();
    @org.junit.Test
    public void addCorrect() {
        assertEquals(c.add(66,22),88);
    }
    @org.junit.Test
    public void addWrong() {
        assertNotEquals(c.add(66,22),87);
    }

    @org.junit.Test
    public void subtractCorrect() {
        assertEquals(c.subtract(22,11),11);
    }

    @org.junit.Test
    public void subtractWrong() {
        assertNotEquals(c.subtract(22,11),10);
    }

    @org.junit.Test
    public void multiplyCorrect() {
        assertEquals(c.multiply(5,5),25);
    }

    @org.junit.Test
    public void multiplyWrong() {
        assertNotEquals(c.multiply(5,5),24);
    }

    @org.junit.Test
    public void divideCorrect() {
        assertEquals(c.divide(5,5),1);
    }

    @org.junit.Test
    public void divideWrong() {
        assertNotEquals(c.divide(5,5),0);
    }

    @org.junit.Test(expected=java.lang.ArithmeticException.class)
    public void divideByZero() {
        c.divide(10,0);
    }
}