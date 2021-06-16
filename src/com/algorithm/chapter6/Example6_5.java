package com.algorithm.chapter6;

public class Example6_5 {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int array[] = new int[]{56, 10, 94, 8, 17, 77, 101, 3, 9, 12, 49, 63, 81, 99};

        for (int item : array) {
            binarySearchTree.insert(item);
        }

        binarySearchTree.breadthFirstSearch(binarySearchTree.getRoot());
    }
}
