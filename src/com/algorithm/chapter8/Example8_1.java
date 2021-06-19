package com.algorithm.chapter8;

import java.util.Arrays;

public class Example8_1 {

    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();
        int[] array = new int[]{2, 8, 0, 5, 7};
        selectionSort.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
