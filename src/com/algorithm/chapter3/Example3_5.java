package com.algorithm.chapter3;

public class Example3_5 {

    public static void main(String[] args) {

        CircleLinkedList circleLinkedList = new CircleLinkedList();
        circleLinkedList.append(11);
        circleLinkedList.append(9);
        circleLinkedList.append(27);
        circleLinkedList.append(41);
        circleLinkedList.append(3);

        System.out.println("원형 단일 연결 리스트={}");
        circleLinkedList.printAll();

    }
}