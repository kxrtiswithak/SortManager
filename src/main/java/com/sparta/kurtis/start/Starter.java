package com.sparta.kurtis.start;

import com.sparta.kurtis.sort.*;
import com.sparta.kurtis.print.Printer;
import com.sparta.kurtis.tree.BinaryTree;

public class Starter {
    private static SortFactory sortFactory = new SortFactory();
    public static void start() {
        // bubbleSortExamples();
        // mergeSortExamples();
        binaryTreeSortExamples();

    }

    public static void bubbleSortExamples() {
        Printer.printString("\n\nBubble Sort Examples\n-----------------------------------------");
        Sorter bubbleSort = sortFactory.getSort("bubble");

        int[] unsortedArray1 = ArrayGenerator.generateIntArray(20, -100, 100);
        Printer.printString("\nBubble sorting unsorted array. before: ");
        Printer.printIntArray(unsortedArray1);
        Printer.printString("after: ");
        unsortedArray1 = bubbleSort.sortArray(unsortedArray1);
        Printer.printIntArray(unsortedArray1);

        Printer.printString("\nBubble sorting sorted array. before: ");
        Printer.printIntArray(unsortedArray1);
        Printer.printString("after: ");
        unsortedArray1 = bubbleSort.sortArray(unsortedArray1);
        Printer.printIntArray(unsortedArray1);
    }

    public static void mergeSortExamples() {
        Printer.printString("\n\nMerge Sort Examples\n-----------------------------------------");
        Sorter mergeSort = sortFactory.getSort("merge");
        int[] unsortedArray2 = ArrayGenerator.generateIntArray(10, -200, 200);

        Printer.printString("\nMerge sorting unsorted array. before: ");
        Printer.printIntArray(unsortedArray2);
        Printer.printString("after: ");
        unsortedArray2 = mergeSort.sortArray(unsortedArray2);
        Printer.printIntArray(unsortedArray2);

        Printer.printString("\nMerge sorting sorted array. before: ");
        Printer.printIntArray(unsortedArray2);
        Printer.printString("after: ");
        unsortedArray2 = mergeSort.sortArray(unsortedArray2);
        Printer.printIntArray(unsortedArray2);
    }

    public static void binaryTreeSortExamples() {
        Printer.printString("\n\nBinary Tree Sort Examples\n-----------------------------------------");
        BinaryTree binaryTreeSort = sortFactory.getTreeSort("binary");

        int[] testArray = ArrayGenerator.generateIntArray(10);
        Printer.printIntArray(testArray);
        binaryTreeSort.addElements(testArray);

        Printer.printIntArray(binaryTreeSort.getSortedTreeAsc());

        binaryTreeSort.addElement(5);

        Printer.printIntArray(binaryTreeSort.getSortedTreeAsc());
    }
}