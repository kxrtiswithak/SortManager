package com.sparta.kurtis.performance;

import com.sparta.kurtis.sort.ArrayGenerator;
import com.sparta.kurtis.sort.Sorter;
import com.sparta.kurtis.tree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;

public abstract class PerformanceTests {

    public int[] smallNumArray;
    public int[] bigNumArray;
    public int[] sortedNumArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Sorter sorter;
    BinaryTree treeSorter;
    long start, end;

    @BeforeEach
    public void setup() {
        smallNumArray = ArrayGenerator.generateIntArray(20, -100, 100);
        bigNumArray = ArrayGenerator.generateIntArray(1000, -10000, 10000);

    }

    @BeforeEach
    abstract void sorter();
}
