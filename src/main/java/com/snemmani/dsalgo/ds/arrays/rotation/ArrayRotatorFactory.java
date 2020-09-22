package com.snemmani.dsalgo.ds.arrays.rotation;

public class ArrayRotatorFactory {
    public static ArrayRotator getRotator(ArrayRotationMethod rotationMethod) {
        switch (rotationMethod) {
            case ONE_AT_A_TIME: return new OneAtATimeRotator();
            case USING_TEMP_ARRAY: return new ArrayRotatorUsingTempArray();
            case REVERSAL: return new ReversalArrayRotator();
            case JUGGLING:
            default: return new JugglingRotator();
        }
    }
}
