package com.snemmani.dsalgo.ds.arrays.sorting;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MergeSortTest {
    @Test
    public void mergeSort() {
        int[] array = {99, 80, 60, 65, 12, 9};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array);
        int[] array2 = {9, 12, 60, 65, 80, 99};
        assertArrayEquals(array2, array);
    }
}
