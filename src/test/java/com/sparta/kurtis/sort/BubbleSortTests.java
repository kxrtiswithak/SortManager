package com.sparta.kurtis.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTests {
    static int[] unsortedValues, sortedValues;
    static BubbleSort bubbleSort;

    @BeforeEach
    public void setup() {
        unsortedValues = new int[]{7, 1, 2, 8, 2, 8, 10, 3, 4, 8, 4, 5, 4, 8, 6, 8, 9};
        sortedValues = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 8, 8, 8, 9, 10};
        bubbleSort = new BubbleSort();
    }

    @Test
    void testSort() {
        assertArrayEquals(sortedValues, bubbleSort.sortArray(unsortedValues));
    }
}
