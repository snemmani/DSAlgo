package com.snemmani.dsalgo.ds.arrays.rotation;

public abstract class ArrayRotator {
    public abstract void leftRotate(int[] array, int d, int n);

    public String arrayToString(int[] array) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<array.length; i++) {
            builder.append(array[i] + " ");
        }
        return builder.toString();
    }
}
