package com.algorithm.chapter10;

import java.util.Arrays;

public class Example10_1 {

    public static void main(String[] args) {

        ShellSort shellSort = new ShellSort();
        int[] array = new int[]{32, 29, 15, 20, 41, 10, 30, 22, 1};

        shellSort.sort(array);

        System.out.println("셸 정렬 완료={}" + Arrays.toString(array));
    }
}
