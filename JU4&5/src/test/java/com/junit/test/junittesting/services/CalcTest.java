// package com.junit.test.junittesting.services;

// import org.junit.After;
// import org.junit.AfterClass;
// import org.junit.Assert;
// import org.junit.Before;
// import org.junit.BeforeClass;
// import org.junit.jupiter.api.Test;

// public class CalcTest {

//     @BeforeClass
//     public void setUp() {
//         System.out.println("Before all test cases");
//     }

//     @AfterClass
//     public void tearDown() {
//         System.out.println("After all test case");
//     }

//     @Before
//     public void init() {
//         System.out.println("Before each test case");
//     }

//     @After
//     public void destroy() {
//         System.out.println("After each test case");
//     }
    
//     @Test
//     public void testAdd() {
//         int result = Calculator.add(10, 20);
//         Assert.assertEquals(30, result);
//     }

//     @Test
//     public void testSubtract() {
//         int result = Calculator.subtract(20, 10);
//         Assert.assertEquals(10, result);
//     }

//     @Test
//     public void testMultiply() {
//         int result = Calculator.multiply(10, 20);
//         Assert.assertEquals(200, result);
//     }

//     @Test
//     public void testDivide() {
//         int result = Calculator.divide(20, 10);
//         Assert.assertEquals(2, result);
//     }

//     @Test
//     public void testModulo() {
//         int result = Calculator.modulo(20, 10);
//         Assert.assertEquals(0, result);
//     }

//     @Test
//     public void testPower() {
//         int result = Calculator.power(2, 3);
//         Assert.assertEquals(8, result);
//     }

//     @Test
//     public void testSquareRoot() {
//         int result = Calculator.squareRoot(16);
//         Assert.assertEquals(4, result);
//     }

//     @Test
//     public void testFactorial() {
//         int result = Calculator.factorial(5);
//         Assert.assertEquals(120, result);
//     }

//     @Test
//     public void testAbsolute() {
//         int result = Calculator.absolute(-5);
//         Assert.assertEquals(5, result);
//     }

//     @Test
//     public void testSumAll() {
//         int result = Calculator.sumAll(1, 2, 3, 4, 5);
//         Assert.assertEquals(15, result);
//     }

// }
