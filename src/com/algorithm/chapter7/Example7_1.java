package com.algorithm.chapter7;

import java.util.Arrays;

public class Example7_1 {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{8, 2, 14, 7, 5};
        bubbleSort.ascSort(array);

        System.out.println(Arrays.toString(array));
    }
}
