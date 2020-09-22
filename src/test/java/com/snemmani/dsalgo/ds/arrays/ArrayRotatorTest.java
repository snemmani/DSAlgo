package com.snemmani.dsalgo.ds.arrays;

import com.snemmani.dsalgo.ds.arrays.rotation.ArrayRotationMethod;
import com.snemmani.dsalgo.ds.arrays.rotation.ArrayRotator;
import com.snemmani.dsalgo.ds.arrays.rotation.ArrayRotatorFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class ArrayRotatorTest {
    private int rotateByCount = 3;
    private int[] array = null;
    private int[] assertionData = generateAssertionData();

    private int[] generateTestData() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    private int[] generateAssertionData() {
        return new int[]{4,5,6,7,8,1,2,3};
    }

    @Test
    public void testOneAtATimeRotator() {
        this.array = generateTestData();
        ArrayRotator rotator = ArrayRotatorFactory.getRotator(ArrayRotationMethod.ONE_AT_A_TIME);
        rotator.leftRotate(array, rotateByCount, array.length);
        assertArrayEquals(array, assertionData);
    }

    @Test
    public void testTempArrayUsageRotator() {
        this.array = generateTestData();
        ArrayRotator rotator = ArrayRotatorFactory.getRotator(ArrayRotationMethod.USING_TEMP_ARRAY);
        rotator.leftRotate(array, rotateByCount, array.length);
        assertArrayEquals(array, assertionData);
    }

    @Test
    public void testJugglingRotator() {
        this.array = generateTestData();
        ArrayRotator rotator = ArrayRotatorFactory.getRotator(ArrayRotationMethod.JUGGLING);
        rotator.leftRotate(this.array, rotateByCount, this.array.length);
        assertArrayEquals(this.array, assertionData);
    }

}
