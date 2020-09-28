package com.snemmani.dsalgo.ds.arrays.sorting;

public class MergeSort implements ArraySort {
    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length-1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if ( left < right ) {
            int mid = left + (right-left)/2;
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            merge(array, left, mid, right);
        }

    }

    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid -left + 1;
        int n2 = right - mid;
        int[] arrayLeft = new int[n1];
        int[] arrayRight = new int[n2];
        int i;
        int j;
        int k;

        for(i=0; i<n1; i++) {
            arrayLeft[i] = array[left+i];
        }

        for(j=0; j<n2; j++) {
            arrayRight[j] = array[mid+j+1];
        }

        i = 0;
        j = 0;
        k = left;
        while ( i < n1 && j < n2 ) {
            if ( arrayLeft[i] < arrayRight[j] ) {
                array[k] = arrayLeft[i];
                i++;
            } else {
                array[k] = arrayRight[j];
                j++;
            }
            k++;
        }

        while (i < n1 ) {
            array[k] = arrayLeft[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = arrayRight[j];
            j++;
            k++;
        }
    }
}
