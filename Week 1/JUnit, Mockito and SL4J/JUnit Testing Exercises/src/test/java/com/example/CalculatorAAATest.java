package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorAAATest {

    Calculator calc;


    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup completed");
    }

    @After
    public void tearDown() {
        System.out.println("Test completed");
    }

    // ------------------------------------------------------------------ //
    //  Tests                                                               //
    // ------------------------------------------------------------------ //

    @Test
    public void testAddition() {

        // Arrange
        int a = 20;
        int b = 10;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testMultiplication() {

        // Arrange
        int a = 5;
        int b = 4;

        // Act
        int result = calc.multiply(a, b);

        // Assert
        assertEquals(20, result);
    }
}
