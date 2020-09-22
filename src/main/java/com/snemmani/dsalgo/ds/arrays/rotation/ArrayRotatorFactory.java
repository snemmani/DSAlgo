package com.snemmani.dsalgo.ds.arrays.rotation;

public class ArrayRotatorFactory {
    public static ArrayRotator getRotator(ArrayRotationMethod rotationMethod) {
        switch (rotationMethod) {
            case JUGGLING: return new JugglingRotator();
            case ONE_AT_A_TIME: return new OneAtATimeRotator();
            case USING_TEMP_ARRAY: return new ArrayRotatorUsingTempArray();
            default: return null;
        }
    }
}
