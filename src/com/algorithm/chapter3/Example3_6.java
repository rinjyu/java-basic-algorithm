package com.algorithm.chapter3;

public class Example3_6 {

    public static void main(String[] args) {

        CircleLinkedList circleLinkedList = new CircleLinkedList();
        circleLinkedList.append(11);
        circleLinkedList.append(9);
        circleLinkedList.append(27);
        circleLinkedList.append(41);
        circleLinkedList.append(3);

        System.out.println("원본 원형 단일 연결 리스트={}");
        circleLinkedList.printAll();

        System.out.println("노드 3을 삭제한 원형 단일 연결 리스트={}");
        circleLinkedList.delete(3);
        circleLinkedList.printAll();

        System.out.println("노드 11을 삭제한 원형 단일 연결 리스트={}");
        circleLinkedList.delete(11);
        circleLinkedList.printAll();

        System.out.println("노드 27을 삭제한 원형 단일 연결 리스트={}");
        circleLinkedList.delete(27);
        circleLinkedList.printAll();
    }
}
