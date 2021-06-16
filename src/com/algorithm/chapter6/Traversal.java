package com.algorithm.chapter6;

public class Traversal {

    public void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(" " + node.getValue());
        preorder(node.getLeftChild());
        preorder(node.getRightChild());
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.getLeftChild());
        System.out.print(" " + node.getValue());
        inorder(node.getRightChild());
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.getLeftChild());
        postorder(node.getRightChild());
        System.out.print(" " + node.getValue());
    }
}
