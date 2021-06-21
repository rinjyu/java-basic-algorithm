package com.algorithm.chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example13_2 {

    public static void main(String[] args) {

        List objectList = new ArrayList();
        List<Integer> integerArrayList1 = new ArrayList<Integer>();
        List<Integer> integerArrayList2 = new ArrayList<>();
        List<String> stringArrayList1 = new ArrayList<>(5);
        List<String> stringArrayList2 = new ArrayList<String>(){{
            add("Apple");
            add("Banana");
            add("Grape");
            add("Orange");
            add("Strawberry");
        }};

        System.out.println("ArrayList에서 자주 사용하는 메소드");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("사과");
        arrayList.add("바나나");
        arrayList.add("포도");
        arrayList.add("오렌지");
        arrayList.add("딸기");

        System.out.println("삭제 전 크기={}" + arrayList.size());

        arrayList.remove("바나나");
        arrayList.remove("딸기");

        System.out.println("삭제 후 크기={}" + arrayList.size());

        String orange = "오렌지";
        boolean isContains = arrayList.contains(orange);
        if (isContains) {
            System.out.println("ArrayList에 " + orange + "가 존재함");
        } else {
            System.out.println("ArrayList에 " + orange + "가 존재하지 않음");
        }

        System.out.println("0번째 인덱스값={}" + arrayList.get(0));

        System.out.println("Iterator를 이용한 ArrayList의 모든 요소 출력");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());

            if (iterator.hasNext()) {
                System.out.print(" => ");
            }
        }

        System.out.println("\n");
        System.out.println("ArrayList 모든 요소 삭제");
        arrayList.clear();
        System.out.println("ArrayList 요소 삭제 후 크기={}" + arrayList.size());
    }
}
