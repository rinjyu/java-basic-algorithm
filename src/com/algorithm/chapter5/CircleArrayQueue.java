package com.algorithm.chapter5;

public class CircleArrayQueue {

    private Object[] data;
    private int MAX_QUEUE_SIZE;
    private int front = 0;
    private int rear = 0;

    CircleArrayQueue(int size) {
        this.MAX_QUEUE_SIZE = size + 1;
        this.data = new Object[this.MAX_QUEUE_SIZE];
    }

    public void enqueue(Object object) {
        if ((rear + 1) % MAX_QUEUE_SIZE == front) {
            throw new ArrayIndexOutOfBoundsException();
        }

        rear = (rear + 1) % MAX_QUEUE_SIZE;
        data[rear] = object;
    }

    public Object dequeue() {

        if (empty()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        front = (front + 1) % MAX_QUEUE_SIZE;
        Object object = data[front];
        data[front] = null;

        return object;
    }

    public boolean empty() {
        return front == rear;
    }

}
