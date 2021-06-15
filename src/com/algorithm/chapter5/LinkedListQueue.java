package com.algorithm.chapter5;

public class LinkedListQueue {

    private Node front = null;
    private Node rear = null;
    private Node peek = null;

    private class Node {

        private Object data;
        private Node next;

        Node (Object data) {
            this.data = data;
        }

        private Object getValue() {
            return this.data;
        }
    }

    public void enqueue(Object data) {

        if (front == null) {
            front = new Node(data);
            peek = front;
            rear = front;
        } else {
            rear.next = new Node(data);
            rear = rear.next;
        }
    }

    public Object dequeue() {

        Object data = peek.getValue();
        Node temp = front;

        front = front.next;
        peek = front;
        temp = null;

        return data;
    }

    public Object peek() {
        return peek.getValue();
    }

    public boolean empty() {
        return peek == null;
    }

    public void printAll() {
        Node temp = front;
        while (temp.next != null) {
            System.out.println(temp.getValue());
            temp = temp.next;
        }
    }
}
