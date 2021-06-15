package com.algorithm.chapter5;

public class ArrayQueue {

    private Object[] array;
    private int MAX_QUEUE_SIZE;
    private int front;
    private int rear;
    private int peek;

    ArrayQueue(int size) {
        this.array = new Object[size];
        this.MAX_QUEUE_SIZE = size;
        this.front = 0;
        this.rear = -1;
        this.peek = this.front;
    }

    public void enqueue(Object data) {
        if (MAX_QUEUE_SIZE - 1 == rear) {
            throw new StackOverflowError();
        }

        array[++rear] = data;
    }

    public Object dequeue() {
        if (front >= MAX_QUEUE_SIZE) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Object data = array[peek];
        array[peek] = null;
        peek = ++front;

        return data;
    }

    public Object peek() {
        return array[peek];
    }

    public boolean isFull() {
        return MAX_QUEUE_SIZE - 1 == rear;
    }
}
