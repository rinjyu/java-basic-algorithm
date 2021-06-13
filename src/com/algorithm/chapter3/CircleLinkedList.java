package com.algorithm.chapter3;

public class CircleLinkedList {

    private Node head;
    private Node tail;

    CircleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int getValue() {
            return this.value;
        }
    }

    public void append(int value) {
        if (this.head == null && this.tail == null) {
            Node node = new Node(value);
            this.head = node;
            this.tail = node;
            return;
        }

        Node pointer = this.tail;
        pointer.next = new Node(value);

        this.tail = pointer.next;
        this.tail.next = head;
    }

    public void delete(int value) {
        Node pointer = this.head;

        if (pointer.getValue() == value) {
            Node removeNode = this.head;
            this.head = this.head.next;

            removeNode = null;
            return;
        }

        Node temp = null;
        while (pointer.next != this.tail && pointer.getValue() != value) {
            temp = pointer;
            pointer = pointer.next;
        }

        if (pointer.next.getValue() == value) {
            this.tail = pointer;
            this.tail.next = this.head;
        } else {
            temp.next = pointer.next;
        }

        pointer = null;
    }

    public void printAll() {
        Node pointer = this.head;

        StringBuilder stringBuilder = new StringBuilder();
        while (pointer != this.tail) {
            stringBuilder.append(pointer.getValue());
            stringBuilder.append(" -> ");
            pointer = pointer.next;
        }

        stringBuilder.append(pointer.getValue());
        stringBuilder.append("(tail) -> ");

        stringBuilder.append(this.head.getValue());
        stringBuilder.append("(head)");

        System.out.println(stringBuilder.toString());
    }
}
