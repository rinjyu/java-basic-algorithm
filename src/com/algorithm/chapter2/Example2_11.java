package com.algorithm.chapter2;

public class Example2_11 {

    public static void main(String[] args) {

        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };

        int[][] array2 = new int[2][3];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[0][2] = 3;
        array2[1][0] = 4;
        array2[1][1] = 5;
        array2[1][2] = 6;

        System.out.println("array1 크기={}" + array1.length);
        System.out.println("array2 크기={}" + array2.length);
    }
}
