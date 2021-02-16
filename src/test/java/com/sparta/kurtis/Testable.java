package com.sparta.kurtis;

import com.sparta.kurtis.sort.ArrayGenerator;
import com.sparta.kurtis.sort.Sorter;
import com.sparta.kurtis.tree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;

public abstract class Testable {
    public int[] smallNumArray;
    public int[] bigNumArray;
    public int[] sortedNumArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public Sorter sorter;
    public BinaryTree treeSorter;

    @BeforeEach
    public void setup() {
        smallNumArray = ArrayGenerator.generateIntArray(20, -100, 100);
        bigNumArray = ArrayGenerator.generateIntArray(1000, -10000, 10000);

    }

    public boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @BeforeEach
    protected abstract void sorter();
}
