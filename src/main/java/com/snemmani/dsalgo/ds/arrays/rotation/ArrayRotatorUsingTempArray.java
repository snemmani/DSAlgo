package com.snemmani.dsalgo.ds.arrays.rotation;

public class ArrayRotatorUsingTempArray extends ArrayRotator {
    @Override
    public void leftRotate(int[] array, int d, int n) {
        int[] tmp = new int[d];
        for (int i=0; i<n-d; i++) {
            if(i<d) {
                tmp[i] = array[i];
            }

            if(i<n-d) {
                array[i] = array[i+d];
            }
        }

        for(int i=0; i<d; i++) {
            array[n-d+i] = tmp[i];
        }
    }
}
