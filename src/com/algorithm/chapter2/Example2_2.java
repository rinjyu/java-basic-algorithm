package com.algorithm.chapter2;

import java.util.Arrays;

public class Example2_2 {

    public static void main(String[] args) {
        int[] array1 = new int[1];
        int[] array2 = new int[]{1, 2, 3};
        int[] array3 = {1, 2, 3, 4, 5};

        System.out.println("array1={}" + Arrays.toString(array1) + " / length={}" + array1.length);
        System.out.println("array2={}" + Arrays.toString(array2) + " / length={}" + array2.length);
        System.out.println("array3={}" + Arrays.toString(array3) + " / length={}" + array3.length);
    }
}
