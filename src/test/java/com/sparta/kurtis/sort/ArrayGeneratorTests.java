package com.sparta.kurtis.sort;

import com.sparta.kurtis.Testable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.kurtis.sort.ArrayGenerator.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayGeneratorTests extends Testable {
    @Override
    protected void sorter() {

    }

    @Test
    @DisplayName("Array Short Length Test")
    void a1Test() {
        assertFalse(isArraySorted(generateIntArray(20)));
    }

    @Test
    @DisplayName("Array Medium Length Test")
    void a2Test() {
        assertFalse(isArraySorted(generateIntArray(10)));
    }

    @Test
    @DisplayName("Array Long Length Test")
    void a3Test() {
        assertFalse(isArraySorted(generateIntArray(10000)));
    }

    @Test
    @DisplayName("Array Short Length and Bounds Test")
    void a4Test() {
        assertFalse(isArraySorted(generateIntArray(20, -1000, 1000)));
    }

    @Test
    @DisplayName("Array Medium Length and Bounds Test")
    void a5Test() {
        assertFalse(isArraySorted(generateIntArray(10, -10000, 10000)));
    }

    @Test
    @DisplayName("Array Long Length Test")
    void a6Test() {
        assertFalse(isArraySorted(generateIntArray(10000, -100000, 100000)));
    }
}
