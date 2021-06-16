package com.algorithm.chapter6;

public class Example6_7 {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int array[] = new int[]{13, 9, 19, 5, 11, 15, 20, 1, 7, 10, 12, 14, 17};

        for (int item : array) {
            binarySearchTree.insert(item);
        }

        new Traversal().preorder(binarySearchTree.getRoot());
    }
}
