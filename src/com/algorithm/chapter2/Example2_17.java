package com.algorithm.chapter2;

import java.util.Arrays;

public class Example2_17 {

    public static void main(String[] args) {

        int[] array = {5, 10, 9, 27, 2, 8, 10, 4, 27, 1};
        int[] result = new int[10];
        System.out.println("결과={}" + Arrays.toString(removeDuplicate(array, result)));
    }

    public static int[] removeDuplicate(int[] array, int[] result) {

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if ((array[i] != -1 && array[j] != -1) && (array[i] == array[j])) {
                    array[i] = -1;
                    array[j] = -1;
                    break;
                }
            }

            if (array[i] != -1) {
                result[index++] = array[i];
            }
        }

        return result;
    }
}
