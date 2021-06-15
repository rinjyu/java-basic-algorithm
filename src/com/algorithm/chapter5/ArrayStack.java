package com.algorithm.chapter5;

public class ArrayStack {

    private Object[] stack;
    private int top;

    ArrayStack(int length) {
        this.top =-1;
        this.stack = new Object[length];
    }

    public void push(Object data) {
        if (top == stack.length - 1) {
            throw new StackOverflowError();
        }

        stack[++top] = data;
    }

    public Object pop() {
        if (top == -1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Object temp = stack[top];
        stack[top--] = null;
        return temp;
    }

    public Object peek() {
        return stack[top];
    }

    public boolean empty() {
        return top == -1;
    }

    public boolean contains(Object data) {

        boolean isContains = false;
        for (Object object: stack) {
            if (object instanceof String && object.equals(data) || object == data) {
                isContains = true;
                break;
            }
        }

        return isContains;
    }

    public int size() {
        return stack.length;
    }
}
