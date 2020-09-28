package com.snemmani.dsalgo.ds.arrays;

public class ArrayUtils {
    private ArrayUtils() {}

    public static String arrayToString(int[] array) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<array.length; i++) {
            builder.append(array[i] + " ");
        }
        return builder.toString();
    }
}
