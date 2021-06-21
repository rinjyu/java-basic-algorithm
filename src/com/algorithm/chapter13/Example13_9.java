package com.algorithm.chapter13;

import java.util.HashSet;
import java.util.Set;

public class Example13_9 {

    public static void main(String[] args) {

        Set set = new HashSet();
        Set<Integer> integerHashSet1 = new HashSet<Integer>();
        Set<Integer> integerHashSet2 = new HashSet<>();
        Set<String> stringHashSet = new HashSet<>(5);
        Set<String> stringHashSet2 = new HashSet<>(){{
            add("computer");
            add("mouse");
            add("keyboard");
        }};

        Set<Integer> hashSet = new HashSet<>();

        int[] array = {10, 20, 40, 50, 30, 60, 90, 80, 70, 100};
        for (int item: array) {
            hashSet.add(item);
        }

        System.out.println("HashSet 데이터 삽입 결과" + hashSet);
        System.out.println("데이터 50의 존재 여부");
        if (hashSet.contains(50)) {
            System.out.println("데이터 50은 포함되어 있음");
        } else {
            System.out.println("데이터 50은 포함되지 않음");
        }

        System.out.println("데이터 삭제 전 HashSet 크기={}" + hashSet.size());

        hashSet.remove(10);
        hashSet.remove(20);
        hashSet.remove(40);

        System.out.println("데이터 삭제 후 HashSet 크기={}" + hashSet.size());
        System.out.println("");

        hashSet.clear();
        System.out.println("clear 메소드 실행 후 HashSet 크기={}" + hashSet.size());
        System.out.println("");

        if (hashSet.isEmpty()) {
            System.out.println("데이터가 존재하지 않은 빈 HashSet");
        } else {
            System.out.println("데이터가 하나 이상 존재하는 HashSet");
        }

    }
}
