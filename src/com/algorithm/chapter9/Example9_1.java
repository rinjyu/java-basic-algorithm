package com.algorithm.chapter9;

import java.util.Arrays;

public class Example9_1 {

    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort();

        int[] array = new int[]{7, 2, 9, 3, 1};
        insertionSort.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
