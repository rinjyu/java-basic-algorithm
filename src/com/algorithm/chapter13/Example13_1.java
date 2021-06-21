package com.algorithm.chapter13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example13_1 {

    public static void main(String[] args) {

        int range = 100000;
        arrayListAdd(range);
        linkedListAdd(range);
    }

    public static void arrayListAdd(int range) {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();

        for (int i = 0; i < range; i++) {
            arrayList.add(i);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("ArrayList add={}" + duration);
    }

    public static void linkedListAdd(int range) {

        List<Integer> linkedList = new LinkedList<>();
        long startTime = System.nanoTime();

        for (int i = 0; i < range; i++) {
            linkedList.add(i);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("LinkedList add={}" + duration);
    }
}
