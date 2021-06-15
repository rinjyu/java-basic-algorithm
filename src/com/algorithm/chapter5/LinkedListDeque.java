package com.algorithm.chapter5;

public class LinkedListDeque {

    private class Node {

        Object data = null;
        Node next = null;

        Node (Object data) {
            this.data = data;
        }

        private Object getValue() {
            return data;
        }
    }

    private Node front = null;
    private Node rear = null;

    public void addFirst(Object data) {

        Node node = new Node(data);
        if (front == null) {
            front = node;
            rear = node;

            return;
        }

        Node temp = front;
        front = node;
        front.next = temp;
    }

    public void addLast(Object data) {

        Node node = new Node(data);

        if (front == null) {
            front = node;
            rear = front;

            return;
        }

        rear.next = node;
        rear = rear.next;
    }

    public Object removeFirst() {

        if (front == null) {
            System.out.println("앞 요소가 존재하지 않음");
            return null;
        }

        Object data = front.getValue();
        front = front.next;

        return data;
    }

    public Object removeLast() {

        if (rear == null) {
            System.out.println("뒤 요소가 존재하지 않음");
            return null;
        }

        Object data = rear.getValue();

        Node temp = front;
        while (temp != null) {
            if (temp.next != rear) {
                temp = temp.next;
                continue;
            }

            rear = temp;
            rear.next = null;
        }

        return data;
    }

    public String print1() {

        String data = "";
        Node temp = front;

        while (temp != null) {
            Object object = temp.getValue();
            temp = temp.next;
            if (temp == null) {
                data += object;
            } else {
                data += String.format("%s => ", object);
            }
        }

        return data;
    }

    public String print2() {

        if (front == null) {
            return "dequeue is empty";
        }

        String data = "";
        Node temp = front;

        for (; temp.next != null; temp = temp.next) {
            data += String.format("%s => ",temp.getValue());
        }

        data += String.format("%s", temp.getValue());

        return data;
    }
}
