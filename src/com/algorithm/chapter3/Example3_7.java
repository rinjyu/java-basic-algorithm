package com.algorithm.chapter3;

public class Example3_7 {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.appendNotDuplicate(85);
        singlyLinkedList.appendNotDuplicate(59);
        singlyLinkedList.appendNotDuplicate(70);
        singlyLinkedList.appendNotDuplicate(85);
        singlyLinkedList.appendNotDuplicate(65);
        singlyLinkedList.appendNotDuplicate(23);
        singlyLinkedList.appendNotDuplicate(70);

        System.out.println("단일 연결 리스트={}");
        singlyLinkedList.printAll();
    }
}