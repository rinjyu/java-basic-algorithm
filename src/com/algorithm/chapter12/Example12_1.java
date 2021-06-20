package com.algorithm.chapter12;

import java.util.Arrays;

public class Example12_1 {

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        int[] array = new int[]{26, 10, 35, 19, 7, 3, 12};

        System.out.println(String.format("초기 배열={}%s", Arrays.toString(array)));
        quickSort.quick(array, 0, array.length - 1);
        System.out.println("퀵정렬 후={}" + Arrays.toString(array));
    }
}
