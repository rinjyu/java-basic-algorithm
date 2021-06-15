package com.algorithm.chapter5;

public class Example5_7 {

    public static void main(String[] args) {

        LinkedListDeque linkedListDeque = new LinkedListDeque();

        linkedListDeque.addFirst("100");
        linkedListDeque.addFirst("200");
        linkedListDeque.addFirst("300");
        linkedListDeque.addFirst("400");
        linkedListDeque.addFirst("500");
        linkedListDeque.addFirst("600");
        linkedListDeque.addFirst("700");

        System.out.println(String.format("삽입 후={} %s", linkedListDeque.print1()));

        linkedListDeque.removeFirst();
        linkedListDeque.removeLast();

        System.out.println(String.format("삭제 후={} %s", linkedListDeque.print1()));

        linkedListDeque.addFirst("800");
        linkedListDeque.addFirst("900");
        linkedListDeque.addFirst("1000");
        linkedListDeque.addFirst("1100");
        linkedListDeque.addFirst("1200");
        linkedListDeque.addFirst("1300");
        linkedListDeque.addFirst("1400");

        System.out.println(String.format("삽입 후={} %s", linkedListDeque.print2()));

        linkedListDeque.removeFirst();
        linkedListDeque.removeLast();

        System.out.println(String.format("삭제 후={} %s", linkedListDeque.print2()));
    }
}
