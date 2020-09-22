package com.snemmani.dsalgo.ds.arrays.rotation;

public class JugglingRotator extends ArrayRotator {
    @Override
    public void leftRotate(int[] array, int d, int n) {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i=0; i<g_c_d; i++) {
            temp = array[i];
            j = i;
            while ( true ) {
                k = j + d;
                if ( k >= n )
                    k = k - n;
                if ( k == i )
                    break;
                array[j] = array[k];
                j = k;
            }
            array[j] = temp;
        }
    }



    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);

    }
}
