package com.sparta.kurtis.tree;

import com.sparta.kurtis.exceptions.ChildNotFoundException;
import com.sparta.kurtis.tree.BinaryTree;

public class BinaryTreeSort implements BinaryTree {
    static class Node {
        public Node left, right;
        public int value;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    Node root;
    int size;
    private int count;
    private int[] arr;


    public BinaryTreeSort(int value) {
        this.root = new Node(value);
    }

    public BinaryTreeSort() {
        this.root = null;
    }


    @Override
    public int getRootElement() {
        return root.value;
    }

    @Override
    public int getNumberOfElements() {
        return size;
    }

    @Override
    public void addElement(int element) {
        root = addRecursive(root, element);
        size++;
    }

    public Node addRecursive(Node current, int element) {
        if (current == null) {
            current = new Node(element);
            return current;
        }

        if (element < current.value) {
            current.left = addRecursive(current.left, element);
        } else if (element > current.value) {
            current.right = addRecursive(current.right, element);
        }

        return current;
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        if (searchElement(root, value) != null) {
            return true;
        }
        return false;
    }

    private Node searchElement(Node root, int element) {
        if (root == null) {
            return null;
        } else if (element == root.value) {
            return root;
        } else if (element > root.value) {
            return searchElement(root.right, element);
        } else {
            return searchElement(root.left, element);
        }
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            throw new ChildNotFoundException("no kids over here");
        } else {
            return searchElement(root, element).left.value;
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            throw new ChildNotFoundException("no kids over here");
        } else {
            return searchElement(root, element).right.value;
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        arr = new int[size];
        count = 0;
        ascRecursive(root);
        return arr;
    }

    private void ascRecursive(Node current) {
        if (current != null) {
            ascRecursive(current.left);
            arr[count++] = current.value;
            ascRecursive(current.right);
        }
    }

    @Override
    public int[] getSortedTreeDesc() {
        arr = new int[size];
        count = 0;
        descRecursive(root);
        return null;
    }

    private void descRecursive(Node current) {
        if (current != null) {
            descRecursive(current.right);
            arr[count++] = current.value;
            descRecursive(current.left);
        }
    }
}
