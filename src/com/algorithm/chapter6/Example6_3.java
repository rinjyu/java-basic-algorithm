package com.algorithm.chapter6;

public class Example6_3 {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node root = new Node(13);
        binarySearchTree.setRoot(root);

        Node node9 = new Node(9);
        Node node17 = new Node(17);
        Node node7 = new Node(7);
        Node node11 = new Node(11);
        Node node14 = new Node(14);

        binarySearchTree.getRoot().setLeftChild(node9);
        node9.setLeftChild(node7);
        node9.setRightChild(node11);

        binarySearchTree.getRoot().setRightChild(node17);
        node17.setLeftChild(node14);

        Node resultNode = binarySearchTree.search(binarySearchTree.getRoot(), 11);
        System.out.println("재귀호출 검색결과={}" + resultNode.getValue());

        Node resultNode2 = binarySearchTree.search(14);
        System.out.println("반복문 검색결과={}" + resultNode2.getValue());
    }
}
