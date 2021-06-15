package com.algorithm.chapter5;

public class Example5_4 {

    public static void main(String[] args) {

        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(1);
        linkedListQueue.enqueue(2);
        linkedListQueue.enqueue(3);
        linkedListQueue.enqueue(4);
        linkedListQueue.enqueue(5);

        System.out.println(String.format("첫번째 값 가져오기={} %s", linkedListQueue.dequeue()));
        System.out.println(String.format("두번째 값 가져오기={} %s", linkedListQueue.dequeue()));
        System.out.println(String.format("세번째 값 가져오기={} %s", linkedListQueue.dequeue()));
        System.out.println("==========");
        System.out.println(String.format("큐의 현재값={} %s", linkedListQueue.peek()));
        System.out.println("==========");
        System.out.println(String.format("네번째 값 가져오기={} %s", linkedListQueue.dequeue()));
        System.out.println(String.format("다섯번째 값 가져오기={} %s", linkedListQueue.dequeue()));

        if (linkedListQueue.empty()) {
            System.out.println("==========");
            System.out.println("큐가 비어있음");
        }
    }
}
