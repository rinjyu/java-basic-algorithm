package com.algorithm.chapter13;

import java.util.HashSet;
import java.util.Set;

public class Example13_8 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        int[] array = {1, 2, 3, 1, 2, 4};
        for (int item: array) {
            System.out.println(String.format("데이터 %s 삽입", item));
            if (set.contains(item)) {
                System.out.println(String.format("\n중복데이터={}%s", item));
            }

            set.add(item);
        }

        System.out.println();

        System.out.println("HasSet 삽입 결과={}" + set);
    }
}
