package com.sparta.kurtis.sorter;

import com.sparta.kurtis.Printer;

public class MergeArray {
    public static int[] mergeTwoArrays(int[] numberArray1, int[] numberArray2) {
        if (numberArray1 == null || numberArray2 == null) {
            Printer.printErrorMessage("computer says no. hit me with some content");
            return null;
        }

        int length1 = numberArray1.length;
        int length2 = numberArray2.length;

        if (length1 == 0 && length2 == 0) {
            Printer.printErrorMessage("diddly squat can be done with diddly squat");
            return null;
        } else if (length1 == 0 || length2 == 0) {
            Printer.printErrorMessage("nothing to merge hun x, one array derelict");
            return null;
        }

        int[] mergedNumberArray = new int[length1 + length2];

        System.arraycopy(numberArray1, 0, mergedNumberArray, 0, length1);
        System.arraycopy(numberArray2, 0, mergedNumberArray, length1, length2);


        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sortArray(mergedNumberArray);
    }

}
