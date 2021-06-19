package com.algorithm.chapter7;

import java.util.Arrays;

public class Example7_3 {

    public static void main(String[] args) {

        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = i;
        }

        boolean isSorted = false;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                isSorted = true;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
