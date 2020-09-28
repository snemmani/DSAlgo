package com.snemmani.dsalgo.ds.arrays.sorting;

public class InsertionSort {
    public void sort(int[] array) {
        int i, j, compareValue;
        for (i=1; i<array.length; i++) {
            j = i-1;
            compareValue = array[i];
            while( j >= 0 && array[j] > compareValue ) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = compareValue;
        }
    }
}
