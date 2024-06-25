package com.junit.test.junittesting.services;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTestJ5 {

    @BeforeAll
    public static void setUp() {
        System.out.println("Before all test cases");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After all test case");
    }

    @BeforeEach
    public void init() {
        System.out.println("Before each test case");
    }

    @AfterEach
    public void destroy() {
        System.out.println("After each test case");
    }
    
    @Test
    @Disabled
    public void testAdd() {
        int result = Calculator.add(3, 4);
        Assertions.assertEquals(7, result, "3 + 4 should equal 7");
    }

    @Test
    @DisplayName("Testing subtract method")
    public void testSumAll() {
        int result = Calculator.sumAll(1, 2, 3, 4, 5);
        Assertions.assertEquals(15, result, "1 + 2 + 3 + 4 + 5 should equal 15");
    }
}
