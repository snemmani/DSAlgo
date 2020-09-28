package com.snemmani.dsalgo.ds.arrays.sorting;

public class InsertionSort  implements ArraySort {
    @Override
    public void sort(int[] array) {
        int i;
        int j;
        int compareValue;
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
