package com.sparta.kurtis.performance;

import com.sparta.kurtis.print.Printer;
import com.sparta.kurtis.sort.SortFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortPerformanceTests extends PerformanceTests {
    @Override
    @BeforeEach
    void sorter() {
        sorter = new SortFactory().getSort("merge");
    }

    @Test
    @DisplayName("Small Number Array Merge Sort Performance")
    public void dTest() {
        start = System.currentTimeMillis();
        sorter.sortArray(smallNumArray);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Small Number Array Merge Sort Performance: %dms%n", end - start);
    }

    @Test
    @DisplayName("Big Number Array Merge Sort Performance")
    public void eTest() {
        start = System.currentTimeMillis();
        sorter.sortArray(bigNumArray);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Big Number Array Merge Sort Performance: %dms%n", end - start);
    }

    @Test
    @DisplayName("Sorted Number Array Merge Sort Performance")
    public void fTest() {
        start = System.currentTimeMillis();
        sorter.sortArray(smallNumArray);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Sorted Number Array Merge Sort Performance: %dms%n", end - start);
    }
}
