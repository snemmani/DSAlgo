package com.snemmani.dsalgo.ds.arrays.rotation;

public class OneAtATimeRotator extends ArrayRotator {
    @Override
    public void leftRotate(int[] array, int d, int n) {
        for (int i=0; i<d; i++) {
            rotateLeftOnce(array, n);
        }
    }



    private void rotateLeftOnce(int[] array, int n) {
        int tmp = array[0];
        int i;
        for(i=0; i<n-1; i++)
            array[i] = array[i+1];
        array[i] = tmp;
    }
}
