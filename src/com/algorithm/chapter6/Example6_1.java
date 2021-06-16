package com.algorithm.chapter6;

public class Example6_1 {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(5));

        Node node10 = new Node(10);
        Node node12 = new Node(12);
        Node node13 = new Node(13);
        Node node9 = new Node(9);
        Node node2 = new Node(2);
        Node node1 = new Node(1);

        binaryTree.getRoot().setLeftChild(node10);
        node10.setLeftChild(node13);
        node13.setLeftChild(node1);

        binaryTree.getRoot().setRightChild(node12);
        node12.setLeftChild(node9);
        node12.setRightChild(node2);

        binaryTree.breadthFirstSearch(binaryTree.getRoot());
    }
}
