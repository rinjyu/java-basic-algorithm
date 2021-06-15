package com.algorithm.chapter5;

public class Example5_2 {

    public static void main(String[] args) {

        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push("1");
        linkedListStack.push("2");
        linkedListStack.push("3");

        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
    }
}
