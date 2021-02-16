package com.sparta.kurtis.sort;

import com.sparta.kurtis.Testable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTests extends Testable {

    @Override
    @BeforeEach
    protected void sorter() {
        sorter = new SortFactory().getSort("bubble");
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
    void a3Test() {
        assertTrue(isArraySorted(sorter.sortArray(sortedNumArray)));
    }

    @Test
    @DisplayName("Empty Array Sort")
    void a4Test() {
        String errorMessage = "naughty naughty, you teasing me with your empty array";
        Exception expectedException = assertThrows(IllegalArgumentException.class, () -> sorter.sortArray(new int[]{}));
        assertEquals(errorMessage, expectedException.getMessage());
    }

}
