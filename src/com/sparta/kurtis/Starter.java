package com.sparta.kurtis;

import com.sparta.kurtis.sorter.BubbleSort;

public class Starter {
    public static void start() {
        BubbleSort bubbleSort = new BubbleSort();
        Printer.printIntArray(bubbleSort.sortArray((new int[]{5, 3, 8, 1, 10, -7, -6, -5, -2, 2, 7, 6, 4, 9})));
        // Printer.printIntArray(BubbleSort.sortArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
