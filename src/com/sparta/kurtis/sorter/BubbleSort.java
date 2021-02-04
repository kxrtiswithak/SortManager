package com.sparta.kurtis.sorter;

import com.sparta.kurtis.Printer;

public class BubbleSort implements Sorter {
    private static int[] numberArray;

     public int[] sortArray(int[] numberArray) {
        BubbleSort.numberArray = numberArray;
        if (BubbleSort.numberArray.length == 0) {
            Printer.printErrorMessage("naughty naughty, you teasing me with your empty array");
            return BubbleSort.numberArray;
        }

        int loopEnd = BubbleSort.numberArray.length - 1;
        boolean isAlreadySorted = true;

        alreadySorted: while (loopEnd > 0) {
            for (int i = 0; i < loopEnd; i++) {
                if (BubbleSort.numberArray[i] > BubbleSort.numberArray[i + 1]) {
                    isAlreadySorted = false;
                    swapTwoNumbers(i);
                }
            }

            if (isAlreadySorted) {
                Printer.printString("already sorted, don't test me m8");
                break alreadySorted;
            }

            loopEnd--;
        }

        return BubbleSort.numberArray;
    }

    private static void swapTwoNumbers(int positionIndex) {
        int tempValue = BubbleSort.numberArray[positionIndex + 1];
        BubbleSort.numberArray[positionIndex + 1] = BubbleSort.numberArray[positionIndex];
        BubbleSort.numberArray[positionIndex] = tempValue;
    }
}
