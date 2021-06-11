package com.algorithm.chapter2;

import java.util.Arrays;

public class Example2_5 {

    public static void main(String[] args) {
        int[] students1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("변경 전={}" + Arrays.toString(students1));

        int[] students2 = new int[students1.length];
        for (int i = 0; i < students1.length; i++) {
            students2[(students1.length - 1) - i] = students1[i];
        }
        System.out.println("변경 후={}" + Arrays.toString(students2));
    }
}
