package com.algorithm.chapter3;

public class DoubleLinkedList {

    private Node head;

    DoubleLinkedList() {
        this.head = null;
    }

    DoubleLinkedList(int value, Node head) {
        this.head = new Node(value, head, null);
    }

    class Node {

        private int value;
        private Node prev;
        private Node next;

        Node (int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        Node (int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        public int getValue() {
            return this.value;
        }
    }

    public Node getHead() {
        return this.head;
    }

    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }

        Node pointer = this.head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        Node newNode = new Node(value);
        newNode.prev = pointer;
        pointer.next = newNode;
    }

    public void delete(int value) {
        Node pointer = this.head;

        if (pointer.getValue() == value) {
            Node removeNode = this.head;
            this.head = this.head.next;

            removeNode = null;
            return;
        }

        Node prevNode = pointer;
        while (pointer != null && pointer.getValue() != value) {
            prevNode = pointer;
            pointer = pointer.next;
        }

        Node temp = pointer.next;
        if (temp == null) {
            prevNode.next = null;
        } else {
            temp.prev = prevNode;
            prevNode.next = pointer.next;
        }

        pointer = null;
    }

    public void printPrevNode(int value) {
        if (this.head == null) {
            System.out.println("이중 연결 리스트가 비어 있습니다.");
            return;
        }

        if (this.head.getValue() == value) {
            System.out.println(String.format("노드 %s의 앞 노드는 존재하지 않습니다.", value));
            return;
        }

        Node pointer = this.head;
        while (pointer != null && pointer.getValue() != value) {
            pointer = pointer.next;
        }

        if (pointer == null) {
            System.out.println(String.format("노드 %s은 존재하지 않습니다.", value));
        } else {
            System.out.println(String.format("노드 %s의 앞 노드의 값은 %s입니다.", value, pointer.prev.getValue()));
        }
    }

    public void printAll() {
        Node pointer = this.head;

        StringBuilder stringBuilder = new StringBuilder();
        while (pointer != null) {
            stringBuilder.append(pointer.getValue());
            stringBuilder.append(" <-> ");
            pointer = pointer.next;
        }

        stringBuilder.delete(stringBuilder.lastIndexOf(" <-> "), stringBuilder.length());
        System.out.println(stringBuilder.toString());
    }
}
