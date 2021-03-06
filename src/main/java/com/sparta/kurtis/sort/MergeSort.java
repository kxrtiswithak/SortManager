package com.sparta.kurtis.sort;

public class MergeSort implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {

        if (arrayToSort == null || arrayToSort.length == 0) {
            throw new IllegalArgumentException("don't test me, cheeky little minx, nothing here");
        }

        if (isArraySorted(arrayToSort)) {
            throw new IllegalArgumentException("don't waste my time smh, already sorted");
        }

        return mergeSortArray(arrayToSort, 0, arrayToSort.length - 1);
    }

    public int[] sortTwoArrays(int[] numberArray1, int[] numberArray2) {
        boolean areArraysNull = numberArray1 == null || numberArray2 == null;
        boolean areArraysEmpty = numberArray1.length == 0 || numberArray2.length == 0;
        if (areArraysNull || areArraysEmpty) {
            throw new IllegalArgumentException("oh stop it, trying to make me act up...with nothing to sort you leave me no choice but to sort you out");
        }

        int[] arraysCombined = combineTwoArrays(numberArray1, numberArray2);

        return sortArray(arraysCombined);
    }

    public int[] mergeTwoSortedArrays(int[] numberArray1, int[] numberArray2) {
        boolean areArraysNull = numberArray1 == null || numberArray2 == null;
        boolean areArraysEmpty = numberArray1.length == 0 || numberArray2.length == 0;
        if (areArraysNull || areArraysEmpty) {
            throw new IllegalArgumentException("you should know by now this ain't working");
        }

        if (isArraySorted(numberArray1) && isArraySorted(numberArray2)) {
            int[] arraysCombined = combineTwoArrays(numberArray1, numberArray2);
            int midIndex = numberArray1.length - 1;
            int endIndex = arraysCombined.length - 1;

            return mergeArray(arraysCombined, 0, midIndex, endIndex);
        } else {
            throw new IllegalArgumentException("Stop! You violated the law. Pay the court a fine \nor serve your sentence. Your stolen goods are \nnow forfeit. Or just use sorted arrays, I'm easy \neither way tbh");
        }

    }

    private int[] mergeArray(int[] numberArray, int beginIndex, int midIndex, int endIndex) {

        int leftLength = midIndex - beginIndex + 1;
        int rightLength = endIndex - midIndex;
        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        if (leftLength >= 0) {
            System.arraycopy(numberArray, beginIndex, leftArray, 0, leftLength);
        }

        if (rightLength >= 0) {
            System.arraycopy(numberArray, midIndex + 1, rightArray, 0, rightLength);
        }

        int leftIndex = 0, rightIndex = 0;
        int count = beginIndex;
        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                numberArray[count] = leftArray[leftIndex];
                leftIndex++;
            } else {
                numberArray[count] = rightArray[rightIndex];
                rightIndex++;
            }
            count++;
        }
        while (leftIndex < leftLength) {
            numberArray[count] = leftArray[leftIndex];
            leftIndex++;
            count++;
        }

        while (rightIndex < rightLength) {
            numberArray[count] = rightArray[rightIndex];
            rightIndex++;
            count++;
        }

        return numberArray;
    }

    private boolean isArraySorted(int[] numberArray) {
        for (int i = 0; i < numberArray.length - 1; i++) {
            if (numberArray[i] > numberArray[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private int[] mergeSortArray(int[] numberArray, int beginIndex, int endIndex) {
        if (beginIndex < endIndex) {
            int midIndex = (beginIndex + endIndex) / 2;
            numberArray = mergeSortArray(numberArray, beginIndex, midIndex);
            numberArray = mergeSortArray(numberArray, midIndex + 1, endIndex);

            return mergeArray(numberArray, beginIndex, midIndex, endIndex);
        }

        return numberArray;
    }

    private int[] combineTwoArrays(int[] numberArray1, int[] numberArray2) {
        int[] arraysCombined = new int[numberArray1.length + numberArray2.length];
        System.arraycopy(numberArray1, 0, arraysCombined, 0, numberArray1.length);
        System.arraycopy(numberArray2, 0, arraysCombined, numberArray1.length, numberArray2.length);

        return arraysCombined;
    }
}
