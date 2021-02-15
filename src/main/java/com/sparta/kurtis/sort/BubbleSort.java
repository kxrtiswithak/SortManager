package com.sparta.kurtis.sort;

import com.sparta.kurtis.exceptions.EmptyArrayException;
import com.sparta.kurtis.print.Printer;

public class BubbleSort implements Sorter {
    private static int[] numberArray;

    @Override
    public int[] sortArray(int[] numberArray) {
        BubbleSort.numberArray = numberArray;

        try {
            if (BubbleSort.numberArray == null || BubbleSort.numberArray.length == 0) {
                throw new EmptyArrayException("naughty naughty, you teasing me with your empty array");
            }
        } catch (EmptyArrayException e) {
            e.printStackTrace();
            return null;
        }  catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        int loopEnd = BubbleSort.numberArray.length - 1;
        boolean isAlreadySorted = true;

        alreadySorted:
        while (loopEnd > 0) {
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
