package com.example.democalctest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void twoAndThreeIsFive() throws Exception {
        final long result = new Calculator().add(2, 3);
        assertEquals(5L, result);
    }

    @Test
    public void twoAndZeroIsTwo() throws Exception {
        final long result = new Calculator().add(2, 0);
        assertEquals(2L, result);
    }

    @Test
    public void twoAndMinusTwoIsZero() throws Exception {
        final long result = new Calculator().add(2, -2);
        assertEquals(0L, result);
    }

    @Test
    public void threeMinusTwoIsOne() throws Exception {
        final long result = new Calculator().subtract(3, 2);
        assertEquals(1L,result);
    }

    @Test
    public void threeMinusThreeIsZero() throws Exception {
        final long result = new Calculator().subtract(3, 3);
        assertEquals(0L,result);
    }

    @Test
    public void threeMinusMinusThreeIsSix() throws Exception {
        final long result = new Calculator().subtract(3, -3);
        assertEquals(2L,result);
    }

    @Test
    public void threeXThreeIsNine() throws Exception {
        final long result = new Calculator().multiply(3, 3);
        assertEquals(9L,result);
    }

    @Test
    public void threeXZeroIsZero() throws Exception {
        final long result = new Calculator().multiply(3, 0);
        assertEquals(0L,result);
    }

    @Test
    public void threeXMinusThreeIsMinusNine() throws Exception {
        final long result = new Calculator().multiply(3, -3);
        assertEquals(-9L,result);
    }

}