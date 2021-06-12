package com.algorithm.chapter2;

import java.util.Arrays;

public class Example2_9 {

    public static void main(String[] args) {

        String[] folder1 = {"Java", "Algorithm"};
        String[] folder2 = new String[folder1.length];

        System.out.println("사본 배열의 값 변경 전 원본 배열={}" + Arrays.toString(folder1));

        for (int i = 0; i < folder1.length; i++) {
            folder2[i] = folder1[i];
        }

        folder2[0] = "Basic";

        System.out.println("사본 배열의 값 변경 후 원본 배열={}" + Arrays.toString(folder1));
        System.out.println("사본 배열의 값 변경 후 사본 배열={}" + Arrays.toString(folder2));
    }
}
