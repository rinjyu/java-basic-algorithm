package com.algorithm.chapter4;

public class Example4_1 {

    public static void main(String[] args) {

        System.out.println("결과={}" + sum(3));
    }

    public static int sum(int range) {

        if (range == 1) {
            return range;
        }

        return range + sum(range - 1);
    }
}
