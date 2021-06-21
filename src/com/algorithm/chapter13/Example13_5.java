package com.algorithm.chapter13;

import java.util.HashMap;
import java.util.Map;

public class Example13_5 {

    public static void main(String[] args) {

        Map ObjectMap = new HashMap();
        Map<String, String> map1 = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<>();
        Map map3 = new HashMap<String, String>();
        Map map4 = new HashMap<String, String>(){{
           put("Apple", "사과");
           put("Banana", "바나나");
           put("Grape", "포도");
           put("Orange", "오렌지");
           put("Strawberry", "딸기");
        }};

        System.out.println("HashMap에서 자주 사용하는 메소드");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Apple", "사과");
        hashMap.put("Banana", "바나나");
        hashMap.put("Grape", "포도");
        hashMap.put("Orange", "오렌지");
        hashMap.put("Strawberry", "딸기");

        System.out.println("데이터 삽입 후 출력 결과");
        print(hashMap);

        System.out.println("값 변경");
        hashMap.replace("Apple", "애플");
        System.out.println(String.format("변경된 HashMap 값={}%s\n", hashMap.get("Apple")));

        System.out.println("Banana 키 존재 확인");
        if (hashMap.containsKey("Banana")) {
            System.out.println("HashMap에 Banana 키가 존재함");
        } else {
            System.out.println("HashMap에 Banana 키가 존재하지 않음");
        }

        System.out.println(String.format("HashMap의 크기={}%s", hashMap.size()));

        hashMap.clear();
        System.out.println(String.format("HashMap 삭제 후 크기={}%s", hashMap.size()));
    }

    public static void print(Map<String, String> map) {
        map.forEach((key, value) -> System.out.println(String.format("%s={}%s", key, value)));
        System.out.println("");
    }
}
