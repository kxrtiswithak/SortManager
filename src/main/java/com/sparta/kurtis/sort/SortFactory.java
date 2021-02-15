package com.sparta.kurtis.sort;

public class SortFactory {
    public Sorter getSort(String sortType) {

        switch(sortType.toLowerCase()) {
            case "bubble":
                return new BubbleSort();
            case "merge":
                return new MergeSort();
            default:
                return null;
        }

    }

    public BinaryTree getTreeSort(String sortType) {
        switch(sortType.toLowerCase()) {
            case "binary":
                return new BinaryTreeSort();
            default:
                return null;
        }
    }
}
