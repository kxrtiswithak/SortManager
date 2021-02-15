package com.sparta.kurtis.binarytree;

import com.sparta.kurtis.exceptions.ChildNotFoundException;
import com.sparta.kurtis.exceptions.EmptyBinaryTreeException;

public class BinaryTreeImpl implements BinaryTree {
    static class Node {
        Node left, right;
        int value;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    Node root;
    int size;

    public BinaryTreeImpl(int value) {
        this.root = new Node(value);
    }

    public BinaryTreeImpl() {
        this.root = null;
    }


    @Override
    public int getRootElement() {
        try {
            if (root != null) {
                return root.value;
            } else {
                throw new EmptyBinaryTreeException("you have no root, like a river without water, a pitiful sight");
            }
        } catch (EmptyBinaryTreeException e) {
            e.printStackTrace();
            return root.value;
        }
    }

    @Override
    public int getNumberOfElements() {
        return size;
    }

    @Override
    public void addElement(int element) {
        if (root == null) {
            root = new Node(element);
        }

        Node current  = root;

        while (current.left != null || current.right != null) {
            if (element < current.value) {
                current = current.left;
            } else if (element >= current.value) {
                current = current.right;
            }
        }

        // if (element) {

        // }
        size++;

    }

    @Override
    public void addElements(int[] elements) {

    }

    @Override
    public boolean findElement(int value) {
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }
}
