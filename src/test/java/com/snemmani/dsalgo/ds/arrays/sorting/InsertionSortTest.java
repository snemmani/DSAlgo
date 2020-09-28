package com.snemmani.dsalgo.ds.arrays.sorting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@RunWith(MockitoJUnitRunner.class)
public class InsertionSortTest {
    @Test
    public void insertionSort() {
        int[] array = {20, 19, 34, 68, 9 , 12, 10};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);
        int[] arrayCompare = {9,10,12,19,20,34,68};
        assertArrayEquals(array, arrayCompare);
    }
}
