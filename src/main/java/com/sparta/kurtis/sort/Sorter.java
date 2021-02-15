package com.sparta.kurtis.sorters;

import com.sparta.kurtis.exceptions.EmptyArrayException;

public interface Sorter {
    int[] sortArray(int[] arrayToSort) throws EmptyArrayException;
}
