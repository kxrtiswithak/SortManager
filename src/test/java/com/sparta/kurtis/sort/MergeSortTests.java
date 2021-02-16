package com.sparta.kurtis.sort;

import com.sparta.kurtis.Testable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTests extends Testable {
    @Override
    @BeforeEach
    protected void sorter() {
        sorter = new SortFactory().getSort("merge");
    }


    @Test
    @DisplayName("Small Number Array Sort")
    void a1Test() {
        assertTrue(isArraySorted(sorter.sortArray(smallNumArray)));
    }

    @Test
    @DisplayName("Big Number Array Sort")
    void a2Test() {
        assertTrue(isArraySorted(sorter.sortArray(bigNumArray)));
    }

    @Test
    @DisplayName("Sorted Number Array Sort")
    void a4Test() {
        String errorMessage = "don't waste my time smh, already sorted";
        Exception expectedException = assertThrows(IllegalArgumentException.class, () -> sorter.sortArray(sortedNumArray));
        assertEquals(errorMessage, expectedException.getMessage());
    }

    @Test
    @DisplayName("Empty Array Sort")
    void a5Test() {
        String errorMessage = "don't test me, cheeky little minx, nothing here";
        Exception expectedException = assertThrows(IllegalArgumentException.class, () -> sorter.sortArray(new int[]{}));
        assertEquals(errorMessage, expectedException.getMessage());
    }


}

