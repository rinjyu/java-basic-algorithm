package com.algorithm.chapter6;

public class Example6_4 {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(13);
        binarySearchTree.insert(9);
        binarySearchTree.insert(17);
        binarySearchTree.insert(7);
        binarySearchTree.insert(11);
        binarySearchTree.insert(14);
        binarySearchTree.insert(14);

        binarySearchTree.breadthFirstSearch(binarySearchTree.getRoot());
    }
}
