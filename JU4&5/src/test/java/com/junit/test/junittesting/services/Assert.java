package com.junit.test.junittesting.services;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Assert {
    
    @Test
    public void testAssert(){
        // assertEquals
        Assertions.assertEquals(1, 1);
        // assertTrue
        Assertions.assertTrue(1 < 2);
        // assertFalse
        Assertions.assertFalse(1 > 2);
        // assertNull
        Assertions.assertNull(null);
        // assertNotNull
        Assertions.assertNotNull(1);
        // assertArrayEquals
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        Assertions.assertArrayEquals(arr1, arr2);
        // assertSame
        int a = 1;
        int b = 1;
        Assertions.assertSame(a, b);
        // assertNotSame
        int c = 1;
        int d = 2;
        Assertions.assertNotSame(c, d);
        // assertIterableEquals
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3);
        Assertions.assertIterableEquals(list1, list2);
        // assertThrows
        Assertions.assertThrows(ArithmeticException.class, () -> {
            int result = 1 / 0;
        });
    }
}
