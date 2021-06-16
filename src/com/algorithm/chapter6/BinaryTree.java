package com.algorithm.chapter6;

import com.algorithm.chapter5.LinkedListQueue;

public class BinaryTree {

    private Node root;

    public void setRoot(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return this.root;
    }

    public int getHeight(Node node) {
        if (node != null) {
            return 1 + Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild()));
        }

        return 0;
    }

    public int getNodeCount() {
        return 0;
    }

    public void breadthFirstSearch(Node data) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(data);

        while (!linkedListQueue.empty()) {
            Node node = (Node) linkedListQueue.dequeue();
            System.out.println(node.getValue() + "");

            if (node.getLeftChild() != null) {
                linkedListQueue.enqueue(node.getLeftChild());
            }

            if (node.getRightChild() != null) {
                linkedListQueue.enqueue(node.getRightChild());
            }
        }
    }
}
