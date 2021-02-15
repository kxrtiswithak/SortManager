package com.sparta.kurtis.performance;

import com.sparta.kurtis.print.Printer;
import com.sparta.kurtis.sort.SortFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortPerformanceTests extends PerformanceTests {
    @Override
    @BeforeEach
    void sorter() {
        sorter = new SortFactory().getSort("bubble");
    }

    @Test
    @DisplayName("Small Number Array Bubble Sort Performance")
    public void aTest() {
        start = System.currentTimeMillis();
        sorter.sortArray(smallNumArray);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Small Number Array Bubble Sort Performance: %dms%n", end - start);
    }

    @Test
    @DisplayName("Big Number Array Bubble Sort Performance")
    public void bTest() {
        start = System.currentTimeMillis();
        sorter.sortArray(bigNumArray);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Big Number Array Bubble Sort Performance: %dms%n", end - start);
    }

    @Test
    @DisplayName("Sorted Number Array Bubble Sort Performance")
    public void cTest() {
        start = System.currentTimeMillis();
        sorter.sortArray(smallNumArray);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Sorted Number Array Bubble Sort Performance: %dms%n", end - start);
    }

}
