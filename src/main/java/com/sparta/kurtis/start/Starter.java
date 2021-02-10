package com.sparta.kurtis.start;

import com.sparta.kurtis.sorters.BubbleSort;
import com.sparta.kurtis.sorters.MergeSort;
import com.sparta.kurtis.view.Printer;

public class Starter {
    public static void start() {

        Printer.printString("\n\nBubble Sort Examples\n-----------------------------------------");
        BubbleSort bubbleSort = new BubbleSort();
        int[] unsortedArray1 = new int[]{5, 3, 8, 1, 10, -7, -6, -5, -2, 2, 7, 6, 4, 9};

        Printer.printString("\nBubble sorting unsorted array. before: ");
        Printer.printIntArray(unsortedArray1);
        Printer.printString("after: ");
        Printer.printIntArray(bubbleSort.sortArray(unsortedArray1));

        int[] sortedArray1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Printer.printString("\nBubble sorting sorted array. before: ");
        Printer.printIntArray(sortedArray1);
        Printer.printString("after: ");
        Printer.printIntArray(bubbleSort.sortArray(sortedArray1));

        Printer.printString("\n\nMerge Sort Examples\n-----------------------------------------");
        MergeSort mergeSort = new MergeSort();
        int[] unsortedArray2 = new int[]{/*90, 23, 101, 45, 65, 23, 67, 89, 34, 23*/};

        Printer.printString("\nMerge sorting unsorted array. before: ");
        Printer.printIntArray(unsortedArray2);
        Printer.printString("after: ");
        Printer.printIntArray((mergeSort.sortArray(unsortedArray2)));

        Printer.printString("\nMerge sorting sorted array. before: ");
        Printer.printIntArray(sortedArray1);
        Printer.printString("after: ");
        Printer.printIntArray((mergeSort.sortArray(sortedArray1)));

        unsortedArray1 = new int[]{5, 3, 8, 1, 10, -7, -6, -5, -2, 2, 7, 6, 4, 9};
        unsortedArray2 = new int[]{90, 23, 101, 45, 65, 23, 67, 89, 34, 23};

        Printer.printString("\nMerge sorting two unsorted arrays. before: ");
        Printer.printIntArray(unsortedArray1);
        Printer.printIntArray(unsortedArray2);
        Printer.printString("after: ");
        Printer.printIntArray(mergeSort.sortTwoArrays(unsortedArray1, unsortedArray2));

        int[] sortedArray2 = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] sortedArray3 = new int[]{3, 7, 11, 19, 42, 76, 141, 983, 1003, 2500};

        Printer.printString("\nMerging two sorted arrays. before: ");
        Printer.printIntArray(sortedArray2);
        Printer.printIntArray(sortedArray3);
        Printer.printString("after: ");
        Printer.printIntArray(mergeSort.mergeTwoSortedArrays(sortedArray2, sortedArray3));

        int[] unsortedArray4 = new int[]{1, 5, 2, 7, 3, 8, 3,  90, 32, 7, 12, 98, -16, 777};
        int[] unsortedArray5 = new int[]{1, 5, 2, 7, 3, 8, 3,  90, 32, 7, 12, 98, -16, 777};
        Printer.printString("\nMerging two unsorted arrays. before: ");
        Printer.printIntArray(unsortedArray4);
        Printer.printIntArray(unsortedArray5);
        Printer.printString("after: ");
        Printer.printIntArray(mergeSort.mergeTwoSortedArrays(unsortedArray4, unsortedArray5));

        Printer.printString();


    }
}