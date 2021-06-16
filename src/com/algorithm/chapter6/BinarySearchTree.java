package com.algorithm.chapter6;

import com.algorithm.chapter5.LinkedListQueue;

public class BinarySearchTree {

    private Node root;

    public void setRoot(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return this.root;
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

    public Node search(Node node, int value) {
        if (node == null) {
            return null;
        } else if (node.getValue() == value) {
            return node;
        } else if (node.getValue() > value) {
            return search(node.getLeftChild(), value);
        } else {
            return search(node.getRightChild(), value);
        }
    }

    public Node search(int value) {
        if (this.root == null) {
            return null;
        }

        Node target = this.root;
        while (target != null && target.getValue() != value) {;
            if (target.getValue() > value) {
                target = target.getLeftChild();
            } else {
                target = target.getRightChild();
            }
        }

        return target;
    }

    public void insert(int value) {
        if (this.root == null) {
            this.root = new Node(value);
            return;
        }

        Node target = this.root;
        Node parent = null;

        while (target != null) {
            parent = target;
            if (target.getValue() == value) {
                System.out.println(String.format("중복 값={}%s, 삽입 중단", value));
                break;
            }

            if (target.getValue() > value) {
                target = target.getLeftChild();

                if (target == null) {
                    parent.setLeftChild(new Node(value));
                }
            } else {
                target = target.getRightChild();

                if (target == null) {
                    parent.setRightChild(new Node(value));
                }
            }
        }
    }

    public Node getMinimumNode(Node node) {
        if (node == null) {
            return null;
        }

        if (node.getLeftChild() != null) {
            return getMinimumNode(node.getLeftChild());
        }

        return node;
    }

    public Node delete(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (root.getValue() == value) {
            if (root.getLeftChild() == null && root.getRightChild() == null) {
                root = null;
                return null;
            } else if (root.getLeftChild() != null && root.getRightChild() == null) {
                Node left = root.getLeftChild();
                root = null;
                return left;
            } else if (root.getLeftChild() == null && root.getRightChild() != null) {
                Node right = root.getRightChild();
                root = null;
                return right;
            } else {
                Node children = getMinimumNode(root.getRightChild());
                root.setValue(children.getValue());
                root.setRightChild(delete(root.getRightChild(), children.getValue()));
            }
        }

        if (root.getValue() > value) {
            root.setLeftChild(delete(root.getLeftChild(), value));
        } else {
            root.setRightChild(delete(root.getRightChild(), value));
        }

        return root;
    }
}
