package com.algorithm.chapter2;

import java.util.Arrays;

public class Example2_8 {

    public static void main(String[] args) {

        String[] folder1 = {"Java", "Algorithm"};
        String[] folder2 = folder1;

        System.out.println("사본 배열의 값 변경 전 원본 배열={}" + Arrays.toString(folder1));

        folder2[0] = "Basic";

        System.out.println("사본 배열의 값 변경 후 원본 배열={}" + Arrays.toString(folder1));
        System.out.println("사본 배열의 값 변경 후 사본 배열={}" + Arrays.toString(folder2));
    }
}
