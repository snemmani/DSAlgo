package com.snemmani.dsalgo.ds.arrays.rotation;

public class ReversalArrayRotator extends ArrayRotator {
    @Override
    public void leftRotate(int[] array, int d, int n) {
        reverse(array, 0, d-1);
        reverse(array, d, n-1);
        reverse(array, 0, n-1);
    }

    private void reverse(int[] array, int startIndex, int endIndex) {
        while (true) {
            if (endIndex - startIndex <= 0) break;
            swap(array, endIndex, startIndex);
            startIndex++;
            endIndex--;
        }
    }

    private void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
