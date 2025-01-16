package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void addNumbers() {
        assertEquals(5, Calculator.addNumbers(2, 3));
        assertEquals(0, Calculator.addNumbers(-3, 3));
        assertEquals(-5, Calculator.addNumbers(-2, -3));
    }

    @Test
    void subtractNumbers() {
        assertEquals(-1, Calculator.subtractNumbers(2, 3));
        assertEquals(-6, Calculator.subtractNumbers(-3, 3));
        assertEquals(1, Calculator.subtractNumbers(-2, -3));
    }

    @Test
    void multiplyNumbers() {
        assertEquals(6, Calculator.multiplyNumbers(2, 3));
        assertEquals(-9, Calculator.multiplyNumbers(-3, 3));
        assertEquals(6, Calculator.multiplyNumbers(-2, -3));
        assertEquals(0, Calculator.multiplyNumbers(0, 5));
    }

    @Test
    void divideNumbers() {
        assertEquals(2, Calculator.divideNumbers(6, 3));
        assertEquals(-2, Calculator.divideNumbers(-6, 3));
        assertEquals(2, Calculator.divideNumbers(-6, -3));

        // Test for division by zero
        assertThrows(ArithmeticException.class, () -> Calculator.divideNumbers(6, 0));
    }
}
