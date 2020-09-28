package com.snemmani.dsalgo.ds.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class ArrayUtilsTest {
    @Test
    public void testArrayToString() {
        int[] array = {1,2,3,4};
        assertEquals("1 2 3 4 ", ArrayUtils.arrayToString(array));
    }
}
