package com.algorithm.chapter13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example13_7 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        int[] array = {10, 20, 40, 50, 30, 60, 90, 80, 70, 100};
        for (int item: array) {
            set.add(item);
            treeSet.add(item);
            linkedHashSet.add(item);
        }

        System.out.println("Set 클래스의 데이터 삽입 후");
        System.out.println("HashSet 결과={}" + set);
        System.out.println("TreeSet 결과={}" + treeSet);
        System.out.println("LinkedHashSet 결과={}" + linkedHashSet);
    }
}
