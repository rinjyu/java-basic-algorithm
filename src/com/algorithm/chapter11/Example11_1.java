package com.algorithm.chapter11;

import java.util.Arrays;

public class Example11_1 {

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        int[] array = new int[]{5, 2, 30, 11, 9, 17, 12, 24};

        System.out.println(String.format("초기 배열={}%s", Arrays.toString(array)));
        mergeSort.merge(array, 0, array.length - 1);

        System.out.println("병합 정렬 완료 후={}" + Arrays.toString(array));
    }
}
