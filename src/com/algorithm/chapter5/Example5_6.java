package com.algorithm.chapter5;

public class Example5_6 {

    public static void main(String[] args) {

        CircleArrayQueue circleArrayQueue = new CircleArrayQueue(5);
        circleArrayQueue.enqueue("사과");
        circleArrayQueue.enqueue("바나나");
        circleArrayQueue.enqueue("딸기");
        circleArrayQueue.enqueue("귤");
        circleArrayQueue.enqueue("배");

        System.out.println(String.format("첫번째 값 가져오기={} %s", circleArrayQueue.dequeue()));
        System.out.println(String.format("두번째 값 가져오기={} %s", circleArrayQueue.dequeue()));
        System.out.println(String.format("세번째 값 가져오기={} %s", circleArrayQueue.dequeue()));
        System.out.println(String.format("네번째 값 가져오기={} %s", circleArrayQueue.dequeue()));
        System.out.println(String.format("다섯번째 값 가져오기={} %s", circleArrayQueue.dequeue()));
        System.out.println("");
        System.out.println("=== 원형 큐이므로 가용 공간 재사용 가능 ===");
        circleArrayQueue.enqueue("체리");
        System.out.println(String.format("여섯번째 값 가져오기={} %s", circleArrayQueue.dequeue()));

        if (circleArrayQueue.empty()) {
            System.out.println("==========");
            System.out.println("큐 비어있음");
        }

    }
}
